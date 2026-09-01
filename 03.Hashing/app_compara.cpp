#include <iostream>
#include <fstream>
#include <algorithm>
#include "separatechaining_hashtable.h"
#include "linearprobing_hashtable.h"

using namespace std;

int main()
{
    SeparateChainingHashTable<string, int> ht;
    //LinearProbingHashTable<string, int> ht;
    ifstream arq("DomCasmurro_utf8.txt");
    if(!arq.is_open()) {
        cout << "Erro abrindo arquivo!" << endl;
        return 1;
    }

    string pal;

    while(arq >> pal) {
        // 1. Remove pontuação
        pal.erase(remove_if(pal.begin(), pal.end(), [](unsigned char c) {
            return ispunct(c);
        }), pal.end());

        // 2. Remove espaços
        pal.erase(remove_if(pal.begin(), pal.end(), [](unsigned char ch) {
            return isspace(ch);
        }), pal.end());

        // 3. Converte para minúsculas
        transform(pal.begin(), pal.end(), pal.begin(), [](unsigned char c) {
            return tolower(c);
        });
        cout << pal << endl;
    }

}