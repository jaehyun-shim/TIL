//
//  main.c
//  UnitTest
//
//  Created by shim on 2019. 4. 5..
//  Copyright © 2019년 shim. All rights reserved.
//

#include <stdio.h>

/**
 <#Description#>

 @param argc <#argc description#>
 @param argv <#argv description#>
 @return <#return value description#>

int main(int argc, const char * argv[]) {
    // insert code here...
    printf("Hello, World!\n");
    return 0;
} */

#include <stdio.h>
int main()
{
    int x = 0, y = 0, m, tmp;
    int a[6] = { 1,2,3,4,0,0 };
    while (a[x] != 0)
    x++;
    x--;
    m = x / 2;
    do {
        tmp = a[x];
        a[x] = a[y];
        a[y] = tmp; x--;
        y++;
    } while (x != m);
        for (int i = 0; i < 6; i++)
            printf("%d", a[i]);
}
