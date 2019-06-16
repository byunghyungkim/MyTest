package File;
import java.io.*;

 

public class SearchWord{

  public static void main(String args[]){
    try {


      // 출력할 파일명과 읽어들일 파일명을지정한다.
      File newFile = new File("D:/temp/aaa.txt");

      InputStream inputStream = new FileInputStream("D:/temp/T_LIST.txt");
      

      OutputStream outStream = new FileOutputStream(newFile);


      // 읽어들일 버퍼크기를 메모리에 생성
      byte[] buf = new byte[1024];

      int len = 0;
      // 끝까지 읽어들이면서 File 객체에 내용들을 쓴다


      while ((len = inputStream.read(buf)) > 0){

         outStream.write(buf, 0, len);

      }
      // Stream 객체를 모두 닫는다.


      outStream.close();

      inputStream.close();

                    

    } catch (FileNotFoundException e) {

      e.printStackTrace();

    } catch (IOException e) {

      e.printStackTrace();

    }

  }

}
