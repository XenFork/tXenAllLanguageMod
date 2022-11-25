// i#代表import >代表as 相当于 import ItemStack as a, #后面写数字代表优先级0为最大有限，表示第几个调用
# 1;
# ItemStack > a;
int k = 3;
var me = "It's me";
while k <= 10
{
    /*
        a b c d e f g
    */
    print /*a b c d e f g*/ << k;
}
// 相当于for(int name = 1; name < 7; name++)
for 1 << 7
{
    for 2 << 14 {
        //常规变量 数组加s
            int i = 1;//1
            val is as ints =
            {
                1, 3, 4, 5, 6, 10
            }
            string j = "abc";//1
            bool k = true;
            long l = 0f;
            float f = 0.1f;//1
            double d = 0.3333333333333;
            print << i , j , k , l , f , d , "end";
    }
}
val some as string =
{
    "random", "a", "solidworks"
}//有{}就略去;
foreach i << some {
    print << i;
}


