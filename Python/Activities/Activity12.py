def sumFun(n):
    if n <= 1:
        return n
    else:
        return n + sumFun(n - 1);

print(sumFun(10));


