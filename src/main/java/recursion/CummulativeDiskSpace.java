package recursion;


import java.io.File;

/***
 * Let's find the cummulative Disk Space for each entry below
 */
public class CummulativeDiskSpace {


    public static void main(String[] args ){

        String path = System.getenv("NEO_HOME")+"/data/databases/neo4j";
        diskSpace(path);
    }


    /***
     * Notice that each line is printed before returning from a recursive call
     * @param path
     * @return
     */
    public static long diskSpace(String path) {

        File root = new File(path);
        long total = root.length();
        if(root.isDirectory()){
            for(String child: root.list()){
                total+= diskSpace(child);
            }
        }
        System.out.println(total + "\t" + root);
        return total;


    }

}
