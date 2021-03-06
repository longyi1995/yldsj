package com.goodsoft.yuanlin.util;

import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * function 文件上传工具类
 * Created by 严彬荣 on 2017/8/4.
 */
@SuppressWarnings("ALL")
@Service
public class FileUpload {

    //实例化公共集合类用以存储文件相对路径
    private List<String> fileList = new ArrayList<String>();
    //实例化UUID工具类
    private UUIDUtil uuid = UUIDUtil.getInstance();

    /**
     * 文件上传辅助方法
     *
     * @param files 上传的文件，
     *              fileType 上传文件类型（苗木、设备租赁等），
     *              savePath 文件保存截取服务器根目录。
     * @return 文件保存相对路径
     */
    public List fileUpload(MultipartFile[] files, String fileType, String savePath) throws IOException {
        StringBuilder sb = new StringBuilder();
        sb.append(savePath);
        //自定义文件保存路径
        String str = "/ylfile/";
        sb.append(str);
        sb.append(fileType);
        sb.append("/");
        //上传文件文件夹路径
        String str1 = sb.toString();
        File folder = new File(str1);
        if (!folder.exists()) {
            folder.mkdirs();
        }
        for (int i = 0, length = files.length; i < length; ++i) {
            //获取文件名
            String fileName = files[i].getOriginalFilename();
            //重命名文件名
            String var = this.uuid.getUUID().toString();
            //获取文件后缀
            String suffix = fileName.substring(fileName.lastIndexOf("."));
            //对于单文件不必清除sb里面的内容，减少不必要的消耗
            if (i > 0) {
                sb.delete(0, sb.length());
                sb.append(str1);
            }
            sb.append(var);
            sb.append(suffix);
            //文件上传到服务器
            files[i].transferTo(new File(sb.toString()));
            //清空sb内容，重新存放文件相对路径以存放数据库
            sb.delete(0, sb.length());
            sb.append(str);
            sb.append(fileType);
            sb.append("/");
            sb.append(var);
            sb.append(suffix);
            fileList.add(sb.toString());
        }
        return fileList;
    }
}
