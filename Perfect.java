import java.util.*;
class Perfect
{
    int num;
    Perfect(int nn)
    {
        num = nn;
    }
    int sum(int x)
    {
        if(num==1)
        return 1;
        else if(num%x==0)
        return num/x + sum(x++);
        else
        return sum(x++);
    }
    check()