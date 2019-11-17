# two sum

## c语言实现第一版,暴力破解法
```
/**
 * Note: The returned array must be malloced, assume caller calls free().
 */

int* twoSum(int* nums, int numsSize, int target, int* returnSize)
{
    int *result = (int *)malloc(sizeof(int) * 2);

    for (int i = 0; i < numsSize; i++)
        for (int j = 0; j < numsSize; j++)
        {
            if (nums[i] + nums[j] == target && i < j)
            {
                result[0] = i;
                result[1] = j;
                *returnSize = 2;
                break;
            }
        }

    return result;
}
```

## c语言实现第二版

```

```

