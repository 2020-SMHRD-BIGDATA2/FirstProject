package Main;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Chart {

	public ArrayList<ChartVO> getList(){
		
		ArrayList<ChartVO> list = new ArrayList<ChartVO>();
		// 1. ������ �����ϴ� ��ġ�� ������ ��� ��ü ����
		File file = new File("C:\\Users\\SHMRD\\Desktop\\chartlib\\���ֱ����� ��౸�к� ��뷮 ������.csv");

		// 2. ���ϰ�ü�� �о�鿩�� ���� ������ Input ��Ʈ�� ����
		try {
			Scanner sc = new Scanner(file);
			sc.nextLine();
			while (sc.hasNextLine()) {  // hasnextline �� ���� ���� ������ �ִ����� ���� true false ������ ��ȯ
				
				String line = sc.nextLine();
				String[] arr = line.split(",");
				
				String division = arr[0];
				int usage = Integer.parseInt(arr[1]);
				String month = arr[2];
				
				ChartVO vo = new ChartVO(division,usage,month);
				list.add(vo);
				
			}
			
			sc.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		return list;
	}

}
