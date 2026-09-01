from separatechaining import SeparateChainingHashTable
from linearprobing import LinearProbingHashTable
import re

if __name__=="__main__":

    ht = SeparateChainingHashTable()

    with open("DomCasmurro_utf8.txt") as arq:
        for linha in arq:
            pals = linha.split()
            for pal in pals:
                pal = pal.lower().strip()
                # Remove tudo que não for letra, número, _,
                # e espaço em branco
                pal = re.sub(r"[^\w]", "", pal)
                if pal == "":
                    continue
                print(pal)