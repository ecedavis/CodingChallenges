#!/bin/python

import sys

arr = []
for arr_i in xrange(6):
    arr_temp = map(int,raw_input().strip().split(' '))
    arr.append(arr_temp)
    #print arr_temp

m = 0
s = 0
I=0
J=0
for i in range(4):
    for j in range(4):
        s=0
        s = s + sum(arr[i][j:j+3])
        s = s + arr[i+1][j+1]
        s = s + sum(arr[i+2][j:j+3])
        if i+j==0: m=s
        if s>m:
            I=i
            J=j
            m=s
print m
