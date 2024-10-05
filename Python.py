from collections import defaultdict

def duplicate(arr):
    freq = defaultdict(int)
    for x in arr:
        freq[x] += 1
        
    res = [x for x in freq if freq[x] > 1]
    return res


if __name__ == "__main__":
    arr = [1, 2, 3, 1, 2, 3, 4, 5, 1, 6, 7, 6, 7]
    res = duplicate(arr)
    for x in res:
        print(x, end=" ")