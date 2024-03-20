import java.util.Scanner;
class Problem1
{
	public static void main(String[] args) {
		int testCases = 0;
		String data[];
		Scanner s = new Scanner(System.in);
		testCases = s.nextInt();
		s.nextLine();
		data = new String [testCases];
		for(int i=0; i<testCases; i++){
			data[i] = s.nextLine(); 
		}

		for (int i=0; i<testCases; i++){
			int match = 0;
			String p=data[i].split(" ")[0];
			String v=data[i].split(" ")[1];

			if(p.length() != v.length()){
				for(int j=0; j<p.length(); j++){
					if(v.length()+j-1>p.length()-1){
						break;
					}
					if(j<p.length()-1){
						String sub = p.substring(j, v.length()+j);
						if(sub.length()==v.length()){
							int count = 0;
							for(int k=0; k<sub.length(); k++){
								if(sub.charAt(k)==v.charAt(k)){
									count++;
								}
							}
							if(count==v.length() || count==v.length()-1){
								System.out.print(j+" ");
								match++;
							}
						}
						//System.out.println("j="+j+" ");
					}
				}
			}else if(p.length()==v.length() && p.equals(v)){
				System.out.print(0);
			}
			if(match==0){
				System.out.print("No Match!");
			}
			System.out.println();
		}
	}
}