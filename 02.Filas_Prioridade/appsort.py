from maxheap import MaxHeap

if __name__=="__main__":
    h = MaxHeap()
    vet = [ 0, 7, 2, 4, 6, 1, 3, 10 ]
    h.sort(vet)
    print(vet)