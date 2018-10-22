#include <iostream> 
#include <conio.h>

using namespace std;

int main()
{

	const int n = 3;
	cout << "Enter the elements of the array" << endl;
	int a[n][n];
	int b[n][n + 1];
	for (int i = 0; i < n; i++)
	{
		
		for (int j = 0; j < n; j++)
		{
			cin >> a[i][j];
			
		}
		
	}
	cout << "the elements are " << endl;
	for (int i = 0; i < n; i++)
	{

		for (int j = 0; j < n; j++)
		{
			
			cout << a[i][j] << "  ";
		}
		cout << endl;
	}

	system("pause");
	return 0;
	
	//_getch();
}
