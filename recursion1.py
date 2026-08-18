def fun(n):
    if n==6:
        return
    if n%2!=0:
        print(n)
    fun(n+1)
    if n%2==0:
        print(n)
fun(1)
        