package Main;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Scanner;

public class csv {

	public static void main(String[] args) throws NumberFormatException, IOException {
//	public ArrayList<bookVO> getList() throws NumberFormatException, IOException {
		bookDAO dao = new bookDAO();
		bookVO vo = null;
		ArrayList<bookVO> list = new ArrayList<bookVO>();
		try {
			String path = "C:\\Users\\SHMRD\\Desktop\\±¤ÁÖ±¤¿ª½Ã_¼­±¸_µµ¼­_20190906.csv";

			FileInputStream input = new FileInputStream(path);
			InputStreamReader reader = new InputStreamReader(input, "euc-kr");
			BufferedReader sc = new BufferedReader(reader);
			sc.readLine();
			String line = sc.readLine();

			int cnt = 1;
			while (!(line.isEmpty())) {
				line = sc.readLine();
				System.out.println(cnt);
				cnt++;
				String value[] = line.split(",");
				String bookid = value[4];
				String name = value[5];
				String author = value[6];
				String publisher = value[7];
				int year = Integer.parseInt(value[8]);
				System.out.print(bookid+",");
				System.out.print(name+",");
				System.out.print(author+",");
				System.out.print(publisher+",");
				System.out.print(year);
				System.out.println();
				vo = new bookVO(bookid, name.replace('^', ','), author.replace('^', ','), publisher.replace('^', ','),
						year);
				try {
					Thread.sleep(100);
					dao.insert(vo);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				

			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (NullPointerException e) {
			System.out.println("ì¢ ");

		}

	}
}
