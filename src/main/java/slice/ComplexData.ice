module ComplexData {
	struct DataInfo{
		string age;
		string name;
		string score;
	};

	sequence<DataInfo> MyDataList;



	interface IMyData{
	    ComplexData::MyDataList getDataList();
	};
};
