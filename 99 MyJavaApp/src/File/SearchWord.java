package File;
import java.io.*;

 

public class SearchWord{

  public static void main(String args[]){
    try {


      // ����� ���ϸ�� �о���� ���ϸ��������Ѵ�.
      File newFile = new File("D:/temp/aaa.txt");

      InputStream inputStream = new FileInputStream("D:/temp/T_LIST.txt");
      

      OutputStream outStream = new FileOutputStream(newFile);


      // �о���� ����ũ�⸦ �޸𸮿� ����
      byte[] buf = new byte[1024];

      int len = 0;
      // ������ �о���̸鼭 File ��ü�� ������� ����


      while ((len = inputStream.read(buf)) > 0){

         outStream.write(buf, 0, len);

      }
      // Stream ��ü�� ��� �ݴ´�.


      outStream.close();

      inputStream.close();

                    

    } catch (FileNotFoundException e) {

      e.printStackTrace();

    } catch (IOException e) {

      e.printStackTrace();

    }

  }

}
