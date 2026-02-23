public class Fraction{
    
    private int numerator;
    private int denominator;
    private static int number_of_fractions;
    
    public Fraction()
    {
        numerator=0;
        denominator=1;
        number_of_fractions++;
    }
    
    public Fraction(int n,int d)
    {
        numerator=n;
        denominator=d;
        number_of_fractions++;
    }
    
    public Fraction(int w)
    {
        numerator=w;
        denominator=1;
        number_of_fractions++;
    }
    
    public Fraction(Fraction other)
    {
        this.numerator=other.numerator;
        this.denominator=other.denominator;
        number_of_fractions++;
    }
    
    private int gcf(int n, int d)
    {
        int send =1;
        int end = Math.min(n,d);
        
        for(int i =1;i<=end;i++)
        {
            if(n%i==0&&d%1==0)
            {
                send = i;
            }
        }
        
        return send;
    }
    
    public String toString()
    {
        return numerator +"/"+denominator;
    }
}
