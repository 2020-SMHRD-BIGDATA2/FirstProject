package Main;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Chart {

	public ArrayList<ChartVO> getList(){
		
		ArrayList<ChartVO> list = new ArrayList<ChartVO>();
		// 1. 파일이 존재하는 위치와 정보를 담는 객체 생성
		File file = new File("C:\\Users\\SHMRD\\Desktop\\chartlib\\광주광역시 계약구분별 사용량 데이터.csv");

		// 2. 파일객체를 읽어들여서 값을 꺼내는 Input 스트림 생성
		try {
			Scanner sc = new Scanner(file);
			sc.nextLine();
			while (sc.hasNextLine()) {  // hasnextline 은 다음 줄을 가지고 있는지를 묻고 true false 값으로 반환
				
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
