//https://www.hackerrank.com/challenges/s10-quartiles/submissions/code/80614354
import statistics as st

def listToInt (list):
    list = list.split(" ")
    for i in range(len(list)):
        list[i] = int(list[i])
    list = sorted(list)
    return list

def getQuartiles(list):
    
    n = int(len(list))
    if(n%2==0):
        l = x[0:int(n/2)]
        u = x[int(n/2) :n]
    else:
        l = x[0:int(n/2)]
        u = x[int(n/2)+1 :n]

    q1 = int(st.median(l))
    q2 = int(st.median(x))
    q3 = int(st.median(u))

    return [q1,q2,q3]


count = int(input())
x = input()
x = listToInt(x)
q = getQuartiles(x)

print (q[0])
print (q[1])
print (q[2])
