l=[5,4,3,2,1,2,3,4]
ans=[-1]*len(l)
st=[]
for i in range(0,len(l)):
    while st and l[i]<=l[st[-1]]:
        st.pop()
    if st:
        ans[i]=st[-1]
    st.append(i)
print(ans)