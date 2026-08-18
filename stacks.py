l=[5,4,3,2,1,2,3,4]
ans=[len(l)]*len(l)
st=[]
for i in range(len(l)-1,-1,-1):
    while st and l[st[-1]]<=l[i]:
        st.pop()
    if st:
        ans[i]=st[-1]-i
    st.append(i)
print(ans)