#include<iostream>
#include<string>
#include<queue>
#include<vector>
using namespace std;

int main(){
    int n;
    cout<<"how many data u enter : ";
    cin>> n;
    vector<string> arr(n);
    

    for(int i=0;i<n;i++){
        cout<<"enter "<<i<<" data : ";
        cin>>arr[i];

    }
    string tar;
    cout<<"Enter target : ";
    cin>>tar;

    pair<string,int> ans={"",9999};

    for(string word : arr){
        int freq=0;
        for(int i=0;i<word.size();i++){
            int flag=0;
            for(int j=0;j<tar.size();j++){
                if(word[i]==tar[j]){
                    flag=1;
                    break;
                }
            }
            if(flag==0){
                freq++;
            }
        
        }
        if(word.size()<tar.size()){
            freq=freq+(tar.size()-word.size());
        }
        if(ans.second>freq){
            ans={word,freq};
        }
        
    }
    cout<<ans.first;
}