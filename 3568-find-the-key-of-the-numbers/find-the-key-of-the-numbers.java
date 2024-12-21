class Solution {
    public int generateKey(int num1, int num2, int num3) {
       
String format1= String.format("%04d", num1);
String format2=String.format("%04d",num2);
String format3=String.format("%04d",num3);
int a=Integer.parseInt(format1);
int b=Integer.parseInt(format2);
int c=Integer.parseInt(format3);
String s="";
while(a!=0)
{
    int g=Math.min((a%10),(b%10));
    int min=Math.min(g,(c%10));
    s=min+s;
    a/=10;
    b/=10;
    c/=10;

}return Integer.parseInt(s);
    }
}