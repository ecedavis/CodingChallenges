//https://www.hackerrank.com/challenges/s10-interquartile-range/problem

//import statistics as st

def listToInt (list):
    list = list.split(" ")
    for i in range(len(list)):
        list[i] = int(list[i])
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
x_values = input()
x_frequencies = input()

x_values = listToInt(x_values)
x_frequencies = listToInt(x_frequencies)
x = list()
for i in range(len(x_values)):
    for j in range(x_frequencies[i]):
        x.append(x_values[i])
x = sorted(x)
#print(x)

q = getQuartiles(x)

print (float(q[2]-q[0]))
