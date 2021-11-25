import java.util.Scanner;

public class ArrEx01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("인원수를 입력 : ");
		int inwon = sc.nextInt();
		
		String name[] = new String[inwon];
		int kor[] = new int[inwon];
		int eng[] = new int[inwon];
		int mat[] = new int[inwon];
		int tot[] = new int[inwon];
		int rank[] = new int[inwon];
		
		for(int i=0;i<inwon;++i) {
			System.out.print(i+1+"번째 학생 이름 : ");
			name[i] = sc.next();
			System.out.print(i+1+"번째 학생 국어 점수 : ");;
			kor[i] = sc.nextInt();
			System.out.print(i+1+"번째 학생 영어 점수 : ");;
			eng[i] = sc.nextInt();
			System.out.print(i+1+"번째 학생 수학 점수 : ");;
			mat[i] = sc.nextInt();
			tot[i] = kor[i]+eng[i]+mat[i];
			rank[i] = 1;//제일 성적이 좋으면 1등이다.
		}
		//전체를 1등으로 만들고 내 성적이 다른사람 성적보다 떨어지면 내 순위를 1등씩 올린다.
		for(int i=0;i<inwon;++i) {
			for(int j=0;j<inwon;j++) {
				if(tot[i] < tot[j]) rank[i]++;
			}
		}
		System.out.print("이름\t국어\t영어\t수학\t총점\t순위\n");
		for(int i=0;i<inwon;++i) {
			System.out.print(name[i]+ "\t");
			System.out.print(kor[i]+ "\t");
			System.out.print(eng[i]+ "\t");
			System.out.print(mat[i]+ "\t");
			System.out.print(tot[i]+ "\t");
			System.out.print(rank[i]+ "\n");
		}
	}

}
