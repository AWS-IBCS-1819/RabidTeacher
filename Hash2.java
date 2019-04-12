import java.util.*;
public class Hash2{

static int[] digits = {1,6,6,6,8};//you can change the numbers to whatever you want
static int has = 0;//beginning value of has short for hash

public static void main(String[] args) {

for(int i = 0; i<=4 ;i++){//for making the hash
  has = digits[0]*17 + has;
  has = digits[1]/9 + has;
  has = digits[2]*has;
  has = (digits[3]*27)/digits[0] + has;
  has = digits[4]*(has*digits[2]);
    }
  System.out.println(has);//printing out the hash
  }
}
