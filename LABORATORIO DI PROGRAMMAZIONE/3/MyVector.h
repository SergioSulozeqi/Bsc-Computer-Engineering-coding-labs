class MyVector{

	public:

		MyVector(int sz);
		~MyVector() { delete[] pt; pt = nullptr; }

		int get_size() { return size; }

		double& operator[](int pos) { return pt[pos]; }
		double operator[](int pos) const { return pt[pos]; }


	private:

		int size;
		double* pt = nullptr;

};

void safe_set(MyVector& v, int i, double d);

double safe_get(MyVector& v, int i);