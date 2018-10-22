#include<iostream> 
#include<fstream> 
#include<math.h> 
#include<Windows.h> 
using namespace std;
int main()
{
	SetConsoleOutputCP(1251);
	SetConsoleCP(1251);
	double e;
	cout << "Enter E: ";
	cin >> e;
	double tmp;
	ofstream fout;
	fout.open("file.txt");
	double i = 1;
	while (true)
	{
		tmp = (i - 0.1) / (pow(i, 3) + abs(tan(i * 2)));
		fout << tmp << endl;
		if (abs(tmp) < e)
			break;
		i++;
	}
	fout.close();
	system("PAUSE");
	return 0;
}