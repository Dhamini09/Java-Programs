class CountExample{
int countofuniq=0;
for(int i=0;i<freq.length;i++)
{
	if(freq[i]==1)
	{
		countofuniq++;
	}
}
System.out.println("Unique elements:"+countofuniq)

//frequency count logic
int freqcount=0;
for(int i=0;i<freq.length;i++)
{
	if(freq[i]!=-1)
	{
		freqcount++;
	}
}
System.out.println("Unique elements:"+freqcount);