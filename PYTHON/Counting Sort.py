#counting sort
def countingsort(string):
  count=[0 for i in range(256)]
  for i in string:
    count[ord(i)]=count[ord(i)]+1 
    output=""
    for i in range(len(count)):
      output=output+(chr(i)*count[i])
  print(output)
  
  
string="kjsjchshchgahcghjagcshgiagsyugashjcgaHUSGCYUWGYU"
countingsort(string)