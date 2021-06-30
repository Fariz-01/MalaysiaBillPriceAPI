# MalaysiaBillPriceAPI
An API to get Malaysia bill prices. This back end is connected to my android application "Utility Bill Calculator".  
The api returns java POJO object -> JSON which includes the id, billName, priceBracketOne - price_bracketEleven (priceBracketOne - price_bracketSeven for water)

# Request Mapping
To access electric/water bill prices by id, the mapping is /api/electric|water/id  
To update electric/water bill price, the PutMapping is just /api/electric|water, pass the json object  
At the moment, no mapping is added to add a new bill provider.  

# List Electric ID - Name
1 - Tenaga Nasional  
2 - Sarawak Energy  
3 - Sabah Electricity  

# List Water ID - Name
1 - Johor  
2 - Kedah  
3 - Kelantan  
4 - Melaka  
5 - Negeri Sembilan  
6 - Pahang  
7 - Penang  
8 - Perak  
9 - Perlis  
10 - Selangor / Kuala Lumpur / Putrajaya (Mapped by /Selangor)  
11 - Terengganu  
12 - Sarawak  
13 - Sarawak Kuching (Mapped by /Kuching)  
14 - Sarawak Sibu (Mapped by /Sibu)  
15 - Sarawak Sri Aman / Miri / Limbing / Sarikei / Kapit (Mapped by /Sri Aman)  
16 - Sarawak Bintulu (Mapped by /Bintulu)  
17 - Sabah  
18 - Labuan  
