package Day05;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Day05_A {

	public static void main(String[] args) {
		// 0. ���� 
				String[][] boards = new String[100][5]; // �Խù� 100�� �����Ҽ� �ִ� �迭 ���� [ �Խù��� 5�� ] 
				Scanner scanner = new Scanner(System.in); // �Է°�ü 
				
				// 1. ���ѷ��� 
				while(true) {
					System.out.println("\n\n================================Ŀ�´�Ƽ====================================");
					System.out.printf(" %2s \t %10s \t %5s \t %5s %3s\n","����" , "����" , "�ۼ���","�ۼ���","��ȸ��");
					// �迭�� ��� �ε��� ���
					for( int i = 0 ; i<boards.length; i++ ) {
						if( boards[i][0] != null ) {
							System.out.printf(" %2d \t %10s \t %5s \t %5s %3s\n" ,
									i , boards[i][0] , boards[i][2],boards[i][3],boards[i][4]);
						}
					}
					
					System.out.println("==========================================================================");
					System.out.print(" 1.�۾��� 2.�ۻ󼼺���  >>���� : "); int ch = scanner.nextInt();
					
					if( ch == 1 ) {
						System.out.println(" >>>>>> �Խù� ���� >>>>>>");
							scanner.nextLine(); // ���� ����
						System.out.print(" ���� : ");	String title = scanner.nextLine();
						System.out.print(" ���� : ");	String contents = scanner.nextLine();
						System.out.print(" �ۼ��� : ");	String writer = scanner.nextLine();
						// ���� ��¥ Ŭ����
						Date now = new Date(); // ���� �ý����� ��¥/�ð� ��ü
							// ��¥ ���� Ŭ���� [ ��¥ ���� �����ϱ� ] 
							SimpleDateFormat dateFormat = new SimpleDateFormat( "MM-dd" );
							String date = dateFormat.format(now);
						// ��ȸ��
						String count = "1";
						// ��� ������ ����� �迭�� ���� 
						for( int i = 0 ; i<boards.length ;i++ ) {
							if( boards[i][0] == null) {
								boards[i][0] = title; boards[i][1] = contents; boards[i][2] = writer; 
								boards[i][3] = date; boards[i][4] = count; break;
							}
						}				
					}
					
					if( ch == 2 ) { 
						System.out.print(" >>> �Խù� ��ȣ ���� : "); 	int ch2 = scanner.nextInt();
							// �ش� �Խù��� ��ȸ�� 1 ����
						int count = Integer.parseInt( boards[ch2][4] ); //  [ ��ȸ��(String) -> int ��ȯ ] 
						boards[ch2][4] = Integer.toString(++count);	// ��ȸ�� ������ -> String ��ȯ 
								
						System.out.println("--------------- �Խù� �������� -----------------");
						System.out.println(" >>> ���� : " + boards[ch2][0]);
						System.out.println(" >>> �ۼ��� :"+ boards[ch2][2] +
								"\t�ۼ��� : "+ boards[ch2][3]+ "\t��ȸ�� : "+boards[ch2][4] );
						System.out.println(" >>> ���� : " + boards[ch2][1] );
						System.out.println("-----------------------------------------------");
					}
				}
				
				
			
			}

			
		}