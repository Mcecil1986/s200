class Conversion
{
public static double footToMeter(double foot){
return 0.305 * foot;
}
public static double meterToFoot(double meter)
{
return 3.279 * meter;
}
public static void main (String[] args)
{
//variable declaration
double meter=1,foot=1;
double fTm,mTf;

fTm= Conversion.footToMeter(foot);
mTf = Conversion.meterToFoot(meter);

System.out.println(foot + " foot equals to "+fTm+" meter" );
System.out.println(meter + " meter equals to "+mTf+ " foot ");
}
}