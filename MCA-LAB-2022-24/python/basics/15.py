s=input('enter the sentence')
w={}
for word in s.lower().split():
    w[word]=w.get(word,0)+1
print(w)
