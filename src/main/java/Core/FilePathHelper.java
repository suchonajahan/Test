package Core;

import java.io.File;

public class FilePathHelper {

    public static final String dir = System.getProperty("user.dir");
    static File f = new File(dir);
    static String filepath = f.getParent();
    public static final String FileBathInCore = filepath+"/AutomationCoverage/src/main/java/repository/localRepo/";

    public static final String postApiPath = FileBathInCore+"employeePost.json";
//    public static final String idReaderPath = FileBathInCore+"id.txt";
//    public static final String updateFilePath = FileBathInCore+"UpdateFormat.json";
//    public static final String updateReaderFilePath =


}
