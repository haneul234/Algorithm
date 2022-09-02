# binary serach algorithm

~~~ java
while (true)
{
    mid = (l+r)/2;
    if(a[mid]==m)
    {
        answer =  mid+1;
        break;
    }
    if(a[l]==m)
    {
        answer = l+1;
        break;
    } else if (a[r]==m) {
        answer = m+1;
        break;
    }
    if (a[mid]>m) {
        r = mid;
    }
    else
    {
        l = mid;
    }
}
~~~

배열에서 임의의 값이 몇번째에 위치해 있는지 이진 검색을 이용해 찾는 알고리즘
