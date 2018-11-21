package com.shopping.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;
import org.springframework.web.multipart.MultipartResolver;
import org.springframework.web.multipart.commons.CommonsMultipartResolver;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Iterator;

@Controller
@RequestMapping("/file")
public class FileController {

    @RequestMapping(value = "/uploadFile" ,method = RequestMethod.POST)
//    public String uploadFile(@RequestParam MultipartFile[] myfiles, HttpServletRequest request) throws IOException {
//    public String uploadFile(@RequestParam MultipartFile fileList, HttpServletRequest request) throws IOException {
//    public String uploadFile(HttpServletRequest request, HttpServletResponse response) throws IOException {
    public String uploadFile(MultipartFile fileList,HttpServletRequest request) throws IOException {
//        for (MultipartFile file : fileList) {
            //此处MultipartFile[]表明是多文件,如果是单文件MultipartFile就行了
            if (fileList.isEmpty()) {
                System.out.println("没有选择文件上传!");
                return "uploadFail";
            } else {
                //得到上传的文件名
                String fileName = fileList.getOriginalFilename();
                System.out.println("fileName:::" + fileName);
                //得到服务器项目发布运行所在地址
                String path1 = request.getSession().getServletContext().getRealPath("WEB-INF/views") + File.separator;
                System.out.println("path1:::" + path1);
                //  此处未使用UUID来生成唯一标识,用日期做为标识
//                String path = path1+ new SimpleDateFormat("yyyyMMddHHmmss").format(new Date())+ fileName;
                String path = path1 + fileName;
                //打印文件上传路径，方便查看是否上传成功
                System.out.println("path:::" + path);
                //把文件上传至path的路径
                File localFile = new File(path);
                fileList.transferTo(localFile);
            }
//        }
        return "uploadSuccess";
    }
}