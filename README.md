# searching-methods-java

### Exaustive Search
```java
public int exaustiveSearch(int key) {
    int pos = 0;
    while (pos < TL && key != vet[pos]) {
        pos++;
    }

    if (pos < TL) {
        return pos;
    }

    return -1;
}
```

### Sentinel Search
```java
public int sentinelSearch(int key) {
    int pos = 0;
    vet[TL] = key;
    while (key != vet[pos]) {
        pos++;
    }

    if (pos < TL)
        return pos;

    return -1;
}
```

### Indexed Search
```java
public int indexedSearch(int key) {
    int pos = 0;
    while(pos < TL && key > vet[pos]) {
        pos++;
    }
    if(pos < TL && key == vet[pos]) {
        return pos;
    }
    return -1;
}
```

### Binary Search

```java
public int binarySearch(int key) {
    int start = 0;
    int end = TL - 1;
    int mid = fim / 2;

    while (start < end && vet[mid] != key) {
        if (key < vet[mid]) {
            end = mid - 1;
        } else {
            start = mid + 1;
        }
        
        mid = (start + end) / 2;
    }

    if (vet[mid] == key) {
        return mid;
    }

    return -1;
}
```
