// i#代表import >代表as 相当于 import ItemStack as a, #后面写数字代表优先级0为最大有限，表示第几个调用
# 1;
# ItemStack > a;
int k = 3;
while(k <= 10)
{
    print >> k;
}
// 相当于for(int name = 1; name < 7; name++)
for 1 to 7
{
    //常规变量 数组加s
    int i = 1;
    val is as ints =
    {
        1, 3, 4, 5, 6, 10
    };
    string j = "abc";
    bool k = true;
    long l = 0f;
    float f = 0.1f;
    double d = 0.3333333333333;
    print >> i >> j >> k >> l >> f >> d >> "end";
}
val some as string =
{
    "random", "a", "solidworks"
};
foreach i in some {
    print >> i;
}


