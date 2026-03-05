class Supermarket {
    public static String[] searchBrandByProduct(String productName) {

        if(productName == "biscuit"){
            String biscuitBrands[] = {
                "Oreo","GoodDay","MarieGold","HideSeek","ParleG","Britannia","Sunfeast","Unibic","Cremica","PriyaGold",
                "Dukes","Anmol","BiskFarm","Horlicks","McVities","Crax","CookieMan","Haldiram's","Bonn","Modern",
                "EnglishOven","MrsBector's","Elite","Nezone","Sobisco","Baker's","MilkyMist","HarvestGold","BonnLite","Parle"};
            return biscuitBrands;
        }
        if(productName == "creamBiscuit"){
            String creamBiscuitBrands[] = {
                "LittleHearts","TreatCroissant","MilkBikis","Bourbon","JimJam","Fab!","Parle","Sunfeast","Britannia Treat","Cremica",
                "Dukes","PriyaGold","Anmol","BiskFarm","Horlicks","McVities","CookieMan","Haldiram's","Bonn","Modern",
                "EnglishOven","MrsBector's","Elite","Nezone","Sobisco","Baker's","MilkyMist","HarvestGold","BonnLite","GoodDay"};
            return creamBiscuitBrands;
        }
        if(productName == "cracker"){
            String crackerBrands[] = {
                "Monaco","KrackJack","50-50","NiceTime","Parle","Britannia","Sunfeast","PriyaGold","Crax","Unibic",
                "Dukes","Anmol","Horlicks","McVities","BiskFarm","CookieMan","Haldiram's","Bonn","Modern","EnglishOven",
                "MrsBector's","Elite","Nezone","Sobisco","Baker's","MilkyMist","HarvestGold","BonnLite","GoodDay","Treat"};
            return crackerBrands;
        }
        if(productName == "cookies"){
            String cookiesBrands[] = {
                "Unibic","MomMagic","DarkFantasy","GoodDayCreamy","Sunfeast","Britannia","Parle","Cremica","PriyaGold","Dukes",
                "Anmol","CookieMan","BiskFarm","Horlicks","McVities","Haldiram's","Bonn","Modern","EnglishOven","MrsBector's",
                "Elite","Nezone","Sobisco","Baker's","MilkyMist","HarvestGold","BonnLite","Treat","GoodDay","NiceTime"};
            return cookiesBrands;
        }
        if(productName == "rusk"){
            String ruskBrands[] = {
                "BritanniaRusk","MilkRusk","GoodDayRusk","EliteRusk","Parle","Modern","HarvestGold","Bonn","MrsBector's","Haldiram's",
                "Anmol","Dukes","BiskFarm","Horlicks","McVities","CookieMan","Nezone","Sobisco","Baker's","MilkyMist",
                "EnglishOven","BonnLite","Elite","GoodDay","NiceTime","Sunfeast","PriyaGold","Cremica","Treat","MomMagic"};
            return ruskBrands;
        }
        if(productName == "shampoo"){
            String shampooBrands[] = {
                "ClinicPlus","Sunsilk","Pantene","HeadShoulders","Dove","Tresemme","Loreal","HerbalEssence","Biotique","WOW",
                "Himalaya","Ayush","Matrix","Schwarzkopf","ParkAvenue","VLCC","Khadi","Mamaearth","Indulekha","Meera",
                "Chik","ClinicAllClear","Sebamed","Fiama","Godrej","Patanjali","ForestEssentials","Streax","SetWet","Parachute"};
            return shampooBrands;
        }
        if(productName == "antiDandruffShampoo"){
            String antiDandruffShampooBrands[] = {
                "HeadShoulders","Scalpe","Selsun","Nizral","Clear","Dove","Himalaya","Sebamed","Ketomac","ClinicAllClear",
                "Ayush","Biotique","ParkAvenue","VLCC","Khadi","Mamaearth","Indulekha","Meera","Chik","Matrix",
                "Schwarzkopf","Tresemme","Loreal","HerbalEssence","WOW","Fiama","Godrej","Patanjali","ForestEssentials","Streax"};
            return antiDandruffShampooBrands;
        }
        if(productName == "herbalShampoo"){
            String herbalShampooBrands[] = {
                "Himalaya","Meera","Chik","Patanjali","Khadi","Biotique","WOW","ForestEssentials","Mamaearth","Ayush",
                "VLCC","Dabur","Indulekha","HerbalEssence","Godrej","Streax","SetWet","ClinicPlus","Tresemme","Loreal",
                "Matrix","Schwarzkopf","ParkAvenue","ClinicAllClear","Sebamed","Fiama","Parachute","Bajaj","Nyle","Vaadi"};
            return herbalShampooBrands;
        }
        if(productName == "soap"){
            String soapBrands[] = {
                "Lux","Lifebuoy","Pears","Dove","Cinthol","Dettol","Santoor","Hamam","GodrejNo1","Fiama",
                "MysoreSandal","Medimix","Patanjali","Khadi","Himalaya","Ayush","Biotique","ForestEssentials","Soulflower","VLCC",
                "Dabur","Johnson","Sebamed","Mamaearth","Nivea","Palmolive","Rexona","Yardley","ParkAvenue","Margo"};
            return soapBrands;
        }
        if(productName == "herbalSoap"){
            String herbalSoapBrands[] = {
                "Medimix","MysoreSandal","Chandrika","Patanjali","Khadi","Himalaya","Ayush","Biotique","ForestEssentials","Soulflower",
                "VLCC","Dabur","Vaadi","Johnson","Sebamed","Mamaearth","Nivea","Palmolive","Rexona","Yardley",
                "ParkAvenue","Margo","GodrejNo1","Fiama","Santoor","Hamam","Cinthol","Dettol","Lux","Lifebuoy"
            };
            return herbalSoapBrands;
        }
        if(productName == "facewash"){
            String facewashBrands[] = {
                "Himalaya","CleanClear","Garnier","Ponds","Nivea","Biotique","Mamaearth","Neutrogena","Lakme","VLCC",
                "Lotus","WOW","Dabur","Khadi","Ayush","ForestEssentials","Sebamed","Johnson","Palmolive","Rexona",
                "Yardley","ParkAvenue","Margo","GodrejNo1","Fiama","Santoor","Hamam","Cinthol","Dettol","Lux"
            };
            return facewashBrands;
        }
        if(productName == "facecream"){
            String facecreamBrands[] = {
                "Ponds","Nivea","Garnier","Lakme","FairLovely","Olay","L'Oreal","Himalaya","Biotique","Mamaearth",
                "Lotus","VLCC","Dabur","Khadi","Ayush","ForestEssentials","Sebamed","Johnson","Palmolive","Rexona",
                "Yardley","ParkAvenue","Margo","GodrejNo1","Fiama","Santoor","Hamam","Cinthol","Dettol","Lux"
            };
            return facecreamBrands;
        }
        if(productName == "toothpaste"){
            String toothpasteBrands[] = {
                "Colgate","Pepsodent","Closeup","Sensodyne","DaburRed","PatanjaliDantKanti","Himalaya","Meswak","Babool","Vicco",
                "AmwayGlister","Aquafresh","Parodontax","OralB","Crest","Signal","Elmex","Marvis","TheraBreath","Biotene",
                "CloSYS","Tom's","Hello","Splat","SensodyneProNamel","Arm&Hammer","Nature'sGate","Ayush","DaburHerb'l","NeemActive"
            };
            return toothpasteBrands;
        }
        if(productName == "toothbrush"){
            String toothbrushBrands[] = {
                "OralB","Colgate","Pepsodent","Sensodyne","Trisa","Jordan","Aquafresh","Dabur","Patanjali","Dr.Best",
                "Closeup","AmwayGlister","Crest","Elmex","Marvis","TheraBreath","Biotene","CloSYS","Tom's","Hello",
                "Splat","SensodyneProNamel","Arm&Hammer","Nature'sGate","Ayush","DaburHerb'l","NeemActive","Signal","Parodontax","Curaprox"
            };
            return toothbrushBrands;
        }
        if(productName == "mouthwash"){
            String mouthwashBrands[] = {
                "Listerine","Colgate","Closeup","Himalaya","Sensodyne","AmwayGlister","Dabur","OralB","TheraBreath","ACT",
                "Biotene","CloSYS","Tom's","Hello","Splat","SensodyneProNamel","Arm&Hammer","Nature'sGate","Ayush","DaburHerb'l",
                "NeemActive","Signal","Parodontax","Curaprox","Elmex","Marvis","Crest","Jordan","Trisa","Dr.Best"
            };
            return mouthwashBrands;
        }
        if(productName == "hairOil"){
            String hairOilBrands[] = {
                "Parachute","Navratna","DaburAmla","Indulekha","BajajAlmond","Nihar","Patanjali","Himalaya","KeshKing","Vatika",
                "Emami","Sesa","Khadi","Mamaearth","ForestEssentials","Soulflower","VLCC","Dabur","Ayush","Biotique",
                "Godrej","Cinthol","Meera","ClinicPlus","Tresemme","Loreal","HerbalEssence","WOW","Sebamed","Fiama"
            };
            return hairOilBrands;
        }
        if(productName == "coconutOil"){
            String coconutOilBrands[] = {
                "Parachute","VVD","KLF","MaxCare","Marico","Patanjali","Himalaya","Dabur","NatureLand","24Mantra",
                "Anveshan","CocoSoul","Khadi","Mamaearth","ForestEssentials","Soulflower","VLCC","Ayush","Biotique","Godrej",
                "Cinthol","Meera","ClinicPlus","Tresemme","Loreal","HerbalEssence","WOW","Sebamed","Fiama","Indulekha"};
            return coconutOilBrands;
        }
        if(productName == "almondOil"){
            String almondOilBrands[] = {
                "Bajaj","Dabur","Hamdard","Patanjali","UrbanBotanics","Khadi","Himalaya","IndusValley","Mamaearth","WishCare",
                "Biotique","Soulflower","VLCC","Ayush","ForestEssentials","Godrej","Cinthol","Meera","ClinicPlus","Tresemme",
                "Loreal","HerbalEssence","WOW","Sebamed","Fiama","Emami","Sesa","KeshKing","Vatika","Nihar"};
            return almondOilBrands;
        }
        if(productName == "rice"){
            String riceBrands[] = {
                "IndiaGate","Daawat","Kohinoor","Fortune","LalQilla","Aeroplane","Tilda","BBRoyal","24Mantra","NatureLand",
                "OrganicIndia","GoldenHarvest","SriSriTattva","Annapurna","DoubleHorse","Aashirvaad","Mother'sChoice","Patel","ShaktiBhog","Pillsbury",
                "Modern","EnglishOven","MrsBector's","Elite","Nezone","Sobisco","Baker's","MilkyMist","HarvestGold","BonnLite"};
            return riceBrands;
        }
        if(productName == "basmatiRice"){
            String basmatiRiceBrands[] = {
                "IndiaGate","Daawat","LalQilla","Kohinoor","Aeroplane","Tilda","BBRoyal","24Mantra","NatureLand","OrganicIndia",
                "GoldenHarvest","Fortune","SriSriTattva","Annapurna","DoubleHorse","Aashirvaad","Mother'sChoice","Patel","ShaktiBhog","Pillsbury",
                "Modern","EnglishOven","MrsBector's","Elite","Nezone","Sobisco","Baker's","MilkyMist","HarvestGold","BonnLite"};
            return basmatiRiceBrands;
        }
        if(productName == "sonaMasuriRice"){
            String sonaMasuriRiceBrands[] = {
                "Fortune","24Mantra","Aashirvaad","BBRoyal","NatureLand","OrganicIndia","GoldenHarvest","SriSriTattva","Daawat","IndiaGate",
                "Annapurna","DoubleHorse","Mother'sChoice","Patel","ShaktiBhog","Pillsbury","Modern","EnglishOven","MrsBector's","Elite",
                "Nezone","Sobisco","Baker's","MilkyMist","HarvestGold","BonnLite","LalQilla","Aeroplane","Tilda","Kohinoor"};
            return sonaMasuriRiceBrands;
        }
                if(productName == "wheatFlour"){
            String wheatFlourBrands[] = {
                "Aashirvaad","Pillsbury","NatureFresh","Fortune","Annapurna","BBRoyal","24Mantra","GoldenHarvest","ShaktiBhog","OrganicIndia",
                "Mother'sChoice","Patel","DoubleHorse","SriSriTattva","Modern","EnglishOven","MrsBector's","Elite","Nezone","Sobisco",
                "Baker's","MilkyMist","HarvestGold","BonnLite","LalQilla","Aeroplane","Tilda","Kohinoor","Daawat","IndiaGate"
            };
            return wheatFlourBrands;
        }
        if(productName == "maida"){
            String maidaBrands[] = {
                "Aashirvaad","Pillsbury","24Mantra","Fortune","BBRoyal","GoldenHarvest","NatureLand","Annapurna","DoubleHorse","ShaktiBhog",
                "OrganicIndia","Mother'sChoice","Patel","SriSriTattva","Modern","EnglishOven","MrsBector's","Elite","Nezone","Sobisco",
                "Baker's","MilkyMist","HarvestGold","BonnLite","LalQilla","Aeroplane","Tilda","Kohinoor","Daawat","IndiaGate"
            };
            return maidaBrands;
        }
        if(productName == "rava"){
            String ravaBrands[] = {
                "DoubleHorse","24Mantra","TataSampann","BBRoyal","GoldenHarvest","NatureLand","Annapurna","Mother'sChoice","ShaktiBhog","OrganicIndia",
                "Patel","SriSriTattva","Modern","EnglishOven","MrsBector's","Elite","Nezone","Sobisco","Baker's","MilkyMist",
                "HarvestGold","BonnLite","LalQilla","Aeroplane","Tilda","Kohinoor","Daawat","IndiaGate","Aashirvaad","Pillsbury"
            };
            return ravaBrands;
        }
        if(productName == "poha"){
            String pohaBrands[] = {
                "Avalakki","TataSampann","24Mantra","BBRoyal","GoldenHarvest","NatureLand","Annapurna","Mother'sChoice","ShaktiBhog","OrganicIndia",
                "Patel","SriSriTattva","Modern","EnglishOven","MrsBector's","Elite","Nezone","Sobisco","Baker's","MilkyMist",
                "HarvestGold","BonnLite","LalQilla","Aeroplane","Tilda","Kohinoor","Daawat","IndiaGate","Aashirvaad","Pillsbury"
            };
            return pohaBrands;
        }
        if(productName == "salt"){
            String saltBrands[] = {
                "TataSalt","AashirvaadSalt","Catch","CaptainCook","Annapurna","Surya","Everest","Saffola","Patanjali","24Mantra",
                "BBRoyal","NatureLand","Modern","EnglishOven","MrsBector's","Elite","Nezone","Sobisco","Baker's","MilkyMist",
                "HarvestGold","BonnLite","LalQilla","Aeroplane","Tilda","Kohinoor","Daawat","IndiaGate","Aashirvaad","Pillsbury"
            };
            return saltBrands;
        }
        if(productName == "sugar"){
            String sugarBrands[] = {
                "Madhur","Uttam","Trust","Dhampure","24Mantra","BBRoyal","NatureLand","OrganicIndia","GoldenHarvest","Patel",
                "Mother'sChoice","SriSriTattva","Modern","EnglishOven","MrsBector's","Elite","Nezone","Sobisco","Baker's","MilkyMist",
                "HarvestGold","BonnLite","LalQilla","Aeroplane","Tilda","Kohinoor","Daawat","IndiaGate","Aashirvaad","Pillsbury"
            };
            return sugarBrands;
        }
        if(productName == "jaggery"){
            String jaggeryBrands[] = {
                "OrganicIndia","24Mantra","BBRoyal","Dhampure","NatureLand","GoldenHarvest","Patel","Mother'sChoice","SriSriTattva","Vedaka",
                "Anveshan","Pure&Sure","Modern","EnglishOven","MrsBector's","Elite","Nezone","Sobisco","Baker's","MilkyMist",
                "HarvestGold","BonnLite","LalQilla","Aeroplane","Tilda","Kohinoor","Daawat","IndiaGate","Aashirvaad","Pillsbury"
            };
            return jaggeryBrands;
        }
        if(productName == "tea"){
            String teaBrands[] = {
                "TataTea","RedLabel","BrookeBond","Society","WaghBakri","Lipton","Tetley","Girnar","TajMahal","OrganicIndia",
                "Typhoo","Twinings","Modern","EnglishOven","MrsBector's","Elite","Nezone","Sobisco","Baker's","MilkyMist",
                "HarvestGold","BonnLite","LalQilla","Aeroplane","Tilda","Kohinoor","Daawat","IndiaGate","Aashirvaad","Pillsbury"
            };
            return teaBrands;
        }
        if(productName == "greenTea"){
            String greenTeaBrands[] = {
                "Tetley","Lipton","Typhoo","Girnar","OrganicIndia","Twinings","TataTea","Society","WaghBakri","24Mantra",
                "LaPlant","OnlyLeaf","Modern","EnglishOven","MrsBector's","Elite","Nezone","Sobisco","Baker's","MilkyMist",
                "HarvestGold","BonnLite","LalQilla","Aeroplane","Tilda","Kohinoor","Daawat","IndiaGate","Aashirvaad","Pillsbury"
            };
            return greenTeaBrands;
        }
        if(productName == "coffee"){
            String coffeeBrands[] = {
                "Bru","Nescafe","Continental","Levista","Sunbean","BlueTokai","RageCoffee","TataCoffee","Davidoff","SleepyOwl",
                "CountryBean","SevenBeans","Modern","EnglishOven","MrsBector's","Elite","Nezone","Sobisco","Baker's","MilkyMist",
                "HarvestGold","BonnLite","LalQilla","Aeroplane","Tilda","Kohinoor","Daawat","IndiaGate","Aashirvaad","Pillsbury"
            };
            return coffeeBrands;
        }
        if(productName == "milk"){
            String milkBrands[] = {
                "Amul","Nandini","Heritage","Arokya","MotherDairy","Gowardhan","MilkyMist","Nestle","Parag","Sanchi",
                "VRS","Vijaya","Modern","EnglishOven","MrsBector's","Elite","Nezone","Sobisco","Baker's","HarvestGold",
                "BonnLite","LalQilla","Aeroplane","Tilda","Kohinoor","Daawat","IndiaGate","Aashirvaad","Pillsbury","BBRoyal"
            };
            return milkBrands;
        }
        if(productName == "curd"){
            String curdBrands[] = {
                "Amul","Nandini","MotherDairy","MilkyMist","Nestle","Heritage","Gowardhan","Arokya","Parag","Sanchi",
                "VRS","Vijaya","Modern","EnglishOven","MrsBector's","Elite","Nezone","Sobisco","Baker's","HarvestGold",
                "BonnLite","LalQilla","Aeroplane","Tilda","Kohinoor","Daawat","IndiaGate","Aashirvaad","Pillsbury","BBRoyal"
            };
            return curdBrands;
        }
        if(productName == "butter"){
            String butterBrands[] = {
                "Amul","Nandini","MilkyMist","Heritage","MotherDairy","Gowardhan","Arokya","Nestle","Parag","Sanchi",
                "VRS","Vijaya","Modern","EnglishOven","MrsBector's","Elite","Nezone","Sobisco","Baker's","HarvestGold",
                "BonnLite","LalQilla","Aeroplane","Tilda","Kohinoor","Daawat","IndiaGate","Aashirvaad","Pillsbury","BBRoyal"
            };
            return butterBrands;
        }
        if(productName == "ghee"){
            String gheeBrands[] = {
                "Amul","Nandini","Patanjali","Aashirvaad","MotherDairy","Gowardhan","Nestle","MilkyMist","Heritage","Parag",
                "Sanchi","VRS","Modern","EnglishOven","MrsBector's","Elite","Nezone","Sobisco","Baker's","HarvestGold",
                "BonnLite","LalQilla","Aeroplane","Tilda","Kohinoor","Daawat","IndiaGate","BBRoyal","24Mantra","GoldenHarvest"
            };
            return gheeBrands;
        }
        if(productName == "paneer"){
            String paneerBrands[] = {
                "Amul","MilkyMist","MotherDairy","Britannia","Nestle","Heritage","Gowardhan","Arokya","Parag","Sanchi",
                "VRS","Vijaya","Modern","EnglishOven","MrsBector's","Elite","Nezone","Sobisco","Baker's","HarvestGold",
                "BonnLite","LalQilla","Aeroplane","Tilda","Kohinoor","Daawat","IndiaGate","BBRoyal","24Mantra","GoldenHarvest"
            };
            return paneerBrands;
        }
        if(productName == "cheese"){
            String cheeseBrands[] = {
                "Amul","Britannia","Go","MilkyMist","MotherDairy","Parag","Nestle","Heritage","Gowardhan","Arokya",
                "Sanchi","VRS","Modern","EnglishOven","MrsBector's","Elite","Nezone","Sobisco","Baker's","HarvestGold",
                "BonnLite","LalQilla","Aeroplane","Tilda","Kohinoor","Daawat","IndiaGate","BBRoyal","24Mantra","GoldenHarvest"
            };
            return cheeseBrands;
        }
        if(productName == "chocolate"){
            String chocolateBrands[] = {
                "DairyMilk","Kitkat","FiveStar","Perk","Munch","Snickers","Mars","Milkybar","Amul","FerreroRocher",
                "Bournville","Toblerone","Modern","EnglishOven","MrsBector's","Elite","Nezone","Sobisco","Baker's","MilkyMist",
                "HarvestGold","BonnLite","LalQilla","Aeroplane","Tilda","Kohinoor","Daawat","IndiaGate","BBRoyal","24Mantra"
            };
            return chocolateBrands;
        }
        if(productName == "darkChocolate"){
            String darkChocolateBrands[] = {
                "Bournville","Lindt","AmulDark","Toblerone","Cadbury","Hershey's","Nestle","Godiva","RitterSport","Ghirardelli",
                "Green&Blacks","Schogetten","Modern","EnglishOven","MrsBector's","Elite","Nezone","Sobisco","Baker's","MilkyMist",
                "HarvestGold","BonnLite","LalQilla","Aeroplane","Tilda","Kohinoor","Daawat","IndiaGate","BBRoyal","24Mantra"
            };
            return darkChocolateBrands;
        }
                if(productName == "noodles"){
            String noodlesBrands[] = {
                "Maggi","Yippee","TopRamen","Knorr","Chings","SunfeastYippee","WaiWai","Smith&Jones","Nissin","Indomie",
                "Samyang","Mama","Nestle","Patanjali","Bambino","MTR","ITC","Haldirams","GoldenHarvest","DoubleHorse",
                "24Mantra","BBRoyal","NatureLand","Modern","EnglishOven","MrsBector's","Elite","Nezone","Sobisco","Baker's"
            };
            return noodlesBrands;
        }
        if(productName == "pasta"){
            String pastaBrands[] = {
                "Weikfield","Borges","DelMonte","Disano","Barilla","Ragusa","Sunfeast","Keya","AmericanGarden","SanRemo",
                "Colavita","Ronzoni","ITC","Haldirams","GoldenHarvest","DoubleHorse","24Mantra","BBRoyal","NatureLand","Modern",
                "EnglishOven","MrsBector's","Elite","Nezone","Sobisco","Baker's","MilkyMist","HarvestGold","BonnLite","Patanjali"
            };
            return pastaBrands;
        }
        if(productName == "vermicelli"){
            String vermicelliBrands[] = {
                "Bambino","MTR","24Mantra","DoubleHorse","Anil","Mother'sRecipe","GoldenHarvest","BBRoyal","NatureLand","Patel",
                "SriSriTattva","Modern","EnglishOven","MrsBector's","Elite","Nezone","Sobisco","Baker's","MilkyMist","HarvestGold",
                "BonnLite","Aashirvaad","Pillsbury","LalQilla","Aeroplane","Tilda","Kohinoor","Daawat","IndiaGate","Sunfeast"
            };
            return vermicelliBrands;
        }
        if(productName == "cornflakes"){
            String cornflakesBrands[] = {
                "Kelloggs","Bagrrys","Mohans","Saffola","Nestle","Quaker","Patanjali","24Mantra","BBRoyal","NatureLand",
                "GoldenHarvest","TrueElements","Modern","EnglishOven","MrsBector's","Elite","Nezone","Sobisco","Baker's","MilkyMist",
                "HarvestGold","BonnLite","DoubleHorse","SriSriTattva","Mother'sChoice","Patel","Aashirvaad","Pillsbury","Sunfeast","ITC"
            };
            return cornflakesBrands;
        }
        if(productName == "oats"){
            String oatsBrands[] = {
                "Quaker","Saffola","Bagrrys","Kelloggs","Nestle","TrueElements","Patanjali","24Mantra","BBRoyal","NatureLand",
                "GoldenHarvest","EcoValley","Modern","EnglishOven","MrsBector's","Elite","Nezone","Sobisco","Baker's","MilkyMist",
                "HarvestGold","BonnLite","DoubleHorse","SriSriTattva","Mother'sChoice","Patel","Aashirvaad","Pillsbury","Sunfeast","ITC"
            };
            return oatsBrands;
        }
        if(productName == "chips"){
            String chipsBrands[] = {
                "Lays","Kurkure","Bingo","Balaji","UncleChips","Haldirams","Pringles","TooYumm","Parle","Peppy",
                "YellowDiamond","Jackers","ITC","Sunfeast","Modern","EnglishOven","MrsBector's","Elite","Nezone","Sobisco",
                "Baker's","MilkyMist","HarvestGold","BonnLite","DoubleHorse","SriSriTattva","Mother'sChoice","Patel","Aashirvaad","Pillsbury"
            };
            return chipsBrands;
        }
        if(productName == "nachos"){
            String nachosBrands[] = {
                "Doritos","Cornitos","TooYumm","BingoMadAngles","Haldirams","UncleChips","Pringles","Peppy","YellowDiamond","Jackers",
                "Parle","Balaji","ITC","Sunfeast","Modern","EnglishOven","MrsBector's","Elite","Nezone","Sobisco",
                "Baker's","MilkyMist","HarvestGold","BonnLite","DoubleHorse","SriSriTattva","Mother'sChoice","Patel","Aashirvaad","Pillsbury"
            };
            return nachosBrands;
        }
        if(productName == "namkeen"){
            String namkeenBrands[] = {
                "Haldirams","Bikaji","Balaji","Garden","Bikanervala","Lehar","Peppy","YellowDiamond","Prakash","MTR",
                "Aakash","Shivdeep","ITC","Sunfeast","Modern","EnglishOven","MrsBector's","Elite","Nezone","Sobisco",
                "Baker's","MilkyMist","HarvestGold","BonnLite","DoubleHorse","SriSriTattva","Mother'sChoice","Patel","Aashirvaad","Pillsbury"
            };
            return namkeenBrands;
        }
        if(productName == "softDrink"){
            String softDrinkBrands[] = {
                "CocaCola","Pepsi","Sprite","Fanta","ThumbsUp","Limca","7Up","MountainDew","Mirinda","Slice",
                "Maaza","AppyFizz","PaperBoat","Real","Tropicana","BNatural","MinuteMaid","Frooti","Safal","Modern",
                "EnglishOven","MrsBector's","Elite","Nezone","Sobisco","Baker's","MilkyMist","HarvestGold","BonnLite","DoubleHorse"
            };
            return softDrinkBrands;
        }
        if(productName == "juice"){
            String juiceBrands[] = {
                "Real","Tropicana","BNatural","PaperBoat","MinuteMaid","Frooti","Slice","Maaza","Appy","DelMonte",
                "Safal","24Mantra","Modern","EnglishOven","MrsBector's","Elite","Nezone","Sobisco","Baker's","MilkyMist",
                "HarvestGold","BonnLite","DoubleHorse","SriSriTattva","Mother'sChoice","Patel","Aashirvaad","Pillsbury","ITC","Sunfeast"
            };
            return juiceBrands;
        }
        if(productName == "waterBottle"){
            String waterBottleBrands[] = {
                "Bisleri","Kinley","Aquafina","Bailey","RailNeer","Himalayan","Oxyrich","Kingfisher","TataWaterPlus","Qua",
                "Vedica","Manikchand","Modern","EnglishOven","MrsBector's","Elite","Nezone","Sobisco","Baker's","MilkyMist",
                "HarvestGold","BonnLite","DoubleHorse","SriSriTattva","Mother'sChoice","Patel","Aashirvaad","Pillsbury","ITC","Sunfeast"
            };
            return waterBottleBrands;
        }
        if(productName == "energyDrink"){
            String energyDrinkBrands[] = {
                "RedBull","Monster","Sting","Tzinga","Cloud9","CocaColaEnergy","MountainDewEnergy","Gatorade","Powerade","GoldWin",
                "XtraPower","BigShot","Modern","EnglishOven","MrsBector's","Elite","Nezone","Sobisco","Baker's","MilkyMist",
                "HarvestGold","BonnLite","DoubleHorse","SriSriTattva","Mother'sChoice","Patel","Aashirvaad","Pillsbury","ITC","Sunfeast"
            };
            return energyDrinkBrands;
        }
                if(productName == "detergentPowder"){
            String detergentPowderBrands[] = {
                "SurfExcel","Ariel","Rin","Tide","Henko","Wheel","Fena","Ghadi","Nirma","Patanjali",
                "Santoor","Godrej","Safewash","Ezee","Ujala","Sunlight","Xpert","Klenz","Keya","Vanish",
                "Mr.White","SuperWash","Excel","PowerWash","Magic","ActiveWheel","Tops","CleanMate","Brillo","Bright"
            };
            return detergentPowderBrands;
        }
        if(productName == "detergentLiquid"){
            String detergentLiquidBrands[] = {
                "SurfExcelL","ArielL","TideL","Genteel","Ezee","Safewash","HenkoL","RinL","FenaL","PatanjaliL",
                "GodrejL","UjalaL","SunlightL","XpertL","KlenzL","KeyaL","VanishL","Mr.WhiteL","SuperWashL","ExcelL",
                "PowerWashL","MagicL","ActiveWheelL","TopsL","CleanMateL","BrilloL","BrightL","SantoorL","NirmaL","WheelL"
            };
            return detergentLiquidBrands;
        }
        if(productName == "fabricConditioner"){
            String fabricConditionerBrands[] = {
                "Comfort","Ezee","Ujala","Genteel","Safewash","Godrej","Patanjali","Henko","Sunlight","Xpert",
                "Klenz","Keya","Vanish","Mr.White","SuperWash","Excel","PowerWash","Magic","ActiveWheel","Tops",
                "CleanMate","Brillo","Bright","Santoor","Nirma","Wheel","Fena","Rin","Ariel","SurfExcel"
            };
            return fabricConditionerBrands;
        }
        if(productName == "dishwashBar"){
            String dishwashBarBrands[] = {
                "Vim","Exo","Pril","TriDish","Gala","Odopic","Patanjali","Xpert","Godrej","Fena",
                "CleanMate","ActiveWheel","Brillo","Bright","Santoor","Nirma","Wheel","Rin","Ariel","SurfExcel",
                "Henko","Sunlight","Ujala","Ezee","Safewash","Genteel","Keya","Vanish","Mr.White","SuperWash"
            };
            return dishwashBarBrands;
        }
        if(productName == "dishwashLiquid"){
            String dishwashLiquidBrands[] = {
                "VimL","PrilL","ExoL","GenteelL","OdopicL","PatanjaliL","XpertL","GodrejL","FenaL","CleanMateL",
                "ActiveWheelL","BrilloL","BrightL","SantoorL","NirmaL","WheelL","RinL","ArielL","SurfExcelL","HenkoL",
                "SunlightL","UjalaL","EzeeL","SafewashL","KeyaL","VanishL","Mr.WhiteL","SuperWashL","ExcelL","PowerWashL"
            };
            return dishwashLiquidBrands;
        }
        if(productName == "floorCleaner"){
            String floorCleanerBrands[] = {
                "Lizol","Colin","Domex","Prokleen","Harpic","Dettol","Patanjali","Godrej","Fena","CleanMate",
                "ActiveWheel","Brillo","Bright","Santoor","Nirma","Wheel","Rin","Ariel","SurfExcel","Henko",
                "Sunlight","Ujala","Ezee","Safewash","Genteel","Keya","Vanish","Mr.White","SuperWash","Excel"
            };
            return floorCleanerBrands;
        }
        if(productName == "toiletCleaner"){
            String toiletCleanerBrands[] = {
                "Harpic","Domex","Sanifresh","VimTC","Lizol","Colin","Prokleen","Dettol","Patanjali","Godrej",
                "Fena","CleanMate","ActiveWheel","Brillo","Bright","Santoor","Nirma","Wheel","Rin","Ariel",
                "SurfExcel","Henko","Sunlight","Ujala","Ezee","Safewash","Genteel","Keya","Vanish","Mr.White"
            };
            return toiletCleanerBrands;
        }
        if(productName == "phenyl"){
            String phenylBrands[] = {
                "Lizol","Domex","Taski","Prokleen","Harpic","Colin","Sanifresh","Dettol","Patanjali","Godrej",
                "Fena","CleanMate","ActiveWheel","Brillo","Bright","Santoor","Nirma","Wheel","Rin","Ariel",
                "SurfExcel","Henko","Sunlight","Ujala","Ezee","Safewash","Genteel","Keya","Vanish","Mr.White"
            };
            return phenylBrands;
        }
        if(productName == "glassCleaner"){
            String glassCleanerBrands[] = {
                "Colin","Lizol","Gala","Pril","Domex","Prokleen","Dettol","Patanjali","Godrej","Fena",
                "CleanMate","ActiveWheel","Brillo","Bright","Santoor","Nirma","Wheel","Rin","Ariel","SurfExcel",
                "Henko","Sunlight","Ujala","Ezee","Safewash","Genteel","Keya","Vanish","Mr.White","SuperWash"
            };
            return glassCleanerBrands;
        }
        if(productName == "handwash"){
            String handwashBrands[] = {
                "Dettol","Savlon","Lifebuoy","Palmolive","Godrej","Patanjali","Himalaya","Dove","Fiama","Lux",
                "Liril","Cinthol","Santoor","Hamam","Medimix","MysoreSandal","VLCC","Biotique","ForestEssentials","Soulflower",
                "Johnson","Sebamed","Mamaearth","Nivea","Rexona","Yardley","ParkAvenue","Margo","Colgate","Pears"
            };
            return handwashBrands;
        }
        if(productName == "sanitizer"){
            String sanitizerBrands[] = {
                "DettolS","SavlonS","LifebuoyS","Sterillium","Godrej","Patanjali","Himalaya","Dove","Fiama","Lux",
                "Liril","Cinthol","Santoor","Hamam","Medimix","MysoreSandal","VLCC","Biotique","ForestEssentials","Soulflower",
                "Johnson","Sebamed","Mamaearth","Nivea","Rexona","Yardley","ParkAvenue","Margo","Colgate","Pears"
            };
            return sanitizerBrands;
        }
        if(productName == "tissue"){
            String tissueBrands[] = {
                "Origami","Premier","SoftTouch","Bella","Kleenex","Scott","Selpak","Wintex","Paseo","Freshee",
                "Godrej","Patanjali","Himalaya","Dove","Fiama","Lux","Liril","Cinthol","Santoor","Hamam",
                "Medimix","MysoreSandal","VLCC","Biotique","ForestEssentials","Soulflower","Johnson","Sebamed","Mamaearth","Nivea"
            };
            return tissueBrands;
        }
        if(productName == "toiletRoll"){
            String toiletRollBrands[] = {
                "OrigamiTR","BellaTR","PremierTR","SoftTouchTR","KleenexTR","ScottTR","SelpakTR","WintexTR","PaseoTR","FresheeTR",
                "Godrej","Patanjali","Himalaya","Dove","Fiama","Lux","Liril","Cinthol","Santoor","Hamam",
                "Medimix","MysoreSandal","VLCC","Biotique","ForestEssentials","Soulflower","Johnson","Sebamed","Mamaearth","Nivea"
            };
            return toiletRollBrands;
        }
        if(productName == "aluminiumFoil"){
            String aluminiumFoilBrands[] = {
                "FreshWrap","Prestige","CleanWrap","WonderFoil","SuperWrap","SilverFoil","AluFresh","AluKing","AluPrime","AluSafe",
                "Godrej","Patanjali","Himalaya","Dove","Fiama","Lux","Liril","Cinthol","Santoor","Hamam",
                "Medimix","MysoreSandal","VLCC","Biotique","ForestEssentials","Soulflower","Johnson","Sebamed","Mamaearth","Nivea"
            };
            return aluminiumFoilBrands;
        }
        if(productName == "clingWrap"){
            String clingWrapBrands[] = {
                "FreshWrap","CleanWrap","WonderWrap","SafePack","SuperWrap","SilverWrap","WrapKing","WrapPrime","WrapSafe","WrapFresh",
                "Godrej","Patanjali","Himalaya","Dove","Fiama","Lux","Liril","Cinthol","Santoor","Hamam",
                "Medimix","MysoreSandal","VLCC","Biotique","ForestEssentials","Soulflower","Johnson","Sebamed","Mamaearth","Nivea"
            };
            return clingWrapBrands;
        }
        if(productName == "garbageBag"){
            String garbageBagBrands[] = {
                "PeeSafe","CleanWrap","Biodegradable","FreshBag","EcoSafe","BioKing","BioPrime","BioFresh","BioSafe","BioWrap",
                "Godrej","Patanjali","Himalaya","Dove","Fiama","Lux","Liril","Cinthol","Santoor","Hamam",
                "Medimix","MysoreSandal","VLCC","Biotique","ForestEssentials","Soulflower","Johnson","Sebamed","Mamaearth","Nivea"
            };
            return garbageBagBrands;
        }
        if(productName == "matchBox"){
            String matchBoxBrands[] = {
                "Ship","Homelite","Aim","ThreeMango","Safety","SuperMatch","PrimeMatch","KingMatch","FreshMatch","SafeMatch",
                "Godrej","Patanjali","Himalaya","Dove","Fiama","Lux","Liril","Cinthol","Santoor","Hamam",
                "Medimix","MysoreSandal","VLCC","Biotique","ForestEssentials","Soulflower","Johnson","Sebamed","Mamaearth","Nivea"
            };
            return matchBoxBrands;
        }
        if(productName == "candles"){
            String candlesBrands[] = {
                "MysoreCandles","Mangaldeep","Cycle","Homelite","PrimeCandles","KingCandles","FreshCandles","SafeCandles","SuperCandles","EliteCandles",
                "Godrej","Patanjali","Himalaya","Dove","Fiama","Lux","Liril","Cinthol","Santoor","Hamam",
                "Medimix","MysoreSandal","VLCC","Biotique","ForestEssentials","Soulflower","Johnson","Sebamed","Mamaearth","Nivea"
            };
            return candlesBrands;
        }
        if(productName == "agarbatti"){
            String agarbattiBrands[] = {
                "Cycle","Mangaldeep","ZedBlack","Moksh","PrimeAgarbatti","KingAgarbatti","FreshAgarbatti","SafeAgarbatti","SuperAgarbatti","EliteAgarbatti",
                "Godrej","Patanjali","Himalaya","Dove","Fiama","Lux","Liril","Cinthol","Santoor","Hamam",
                "Medimix","MysoreSandal","VLCC","Biotique","ForestEssentials","Soulflower","Johnson","Sebamed","Mamaearth","Nivea"
            };
            return agarbattiBrands;
        }
        if(productName == "battery"){
            String batteryBrands[] = {
                "Eveready","Duracell","Panasonic","Nippo","Varta","Sony","Philips","Maxell","GP","Kodak",
                "Camelion","Eneloop","Rayovac","Energizer","Bosch","Amaron","Exide","Luminous","Okaya","Base",
                "Microtek","Rocket","Toshiba","Samsung","Hitachi","Fujitsu","MoserBaer","PowerCell","Sunlite","PowerPlus"
            };
            return batteryBrands;
        }
        if(productName == "bulb"){
            String bulbBrands[] = {
                "Philips","Havells","Syska","Wipro","Surya","Eveready","Bajaj","Crompton","Osram","GE",
                "Panasonic","Orient","Anchor","Goldmedal","Polycab","Halonix","Luminous","V-Guard","Legrand","Finolex",
                "GM","Cona","Lloyd","Inalsa","Usha","Bright","Glow","LiteOn","Sunlite","PowerPlus"
            };
            return bulbBrands;
        }
        if(productName == "extensionBoard"){
            String extensionBoardBrands[] = {
                "Havells","GM","Anchor","Goldmedal","Syska","Wipro","Philips","Cona","Legrand","Finolex",
                "Polycab","Orient","Bajaj","Crompton","Eveready","Surya","Luminous","V-Guard","Inalsa","Usha",
                "Lloyd","Bright","Glow","LiteOn","Sunlite","PowerPlus","Microtek","Rocket","Toshiba","Samsung"
            };
            return extensionBoardBrands;
        }
        if(productName == "mop"){
            String mopBrands[] = {
                "ScotchBrite","SpotZero","Gala","Milton","Prestige","Cello","Pigeon","Bathla","TruClean","QuickClean",
                "WonderMop","MagicMop","SuperMop","CleanMate","HomeCare","EasyMop","PrimeMop","KingMop","FreshMop","SafeMop",
                "EliteMop","SupremeMop","Princeware","Generic","Bright","Glow","LiteOn","Sunlite","PowerPlus","Rocket"
            };
            return mopBrands;
        }
        if(productName == "broom"){
            String broomBrands[] = {
                "Gala","SpotZero","ScotchBrite","Generic","Milton","Prestige","Cello","Pigeon","Bathla","TruClean",
                "QuickClean","WonderBroom","MagicBroom","SuperBroom","CleanMate","HomeCare","EasyBroom","PrimeBroom","KingBroom","FreshBroom",
                "SafeBroom","EliteBroom","SupremeBroom","Princeware","Bright","Glow","LiteOn","Sunlite","PowerPlus","Rocket"
            };
            return broomBrands;
        }
        if(productName == "bucket"){
            String bucketBrands[] = {
                "Cello","Milton","Supreme","Princeware","Prestige","Pigeon","Bathla","TruClean","QuickClean","WonderBucket",
                "MagicBucket","SuperBucket","CleanMate","HomeCare","EasyBucket","PrimeBucket","KingBucket","FreshBucket","SafeBucket","EliteBucket",
                "SpotZero","Gala","ScotchBrite","Generic","Bright","Glow","LiteOn","Sunlite","PowerPlus","Rocket"
            };
            return bucketBrands;
        }
        if(productName == "mug"){
            String mugBrands[] = {
                "Cello","Milton","Supreme","Princeware","Prestige","Pigeon","Bathla","TruClean","QuickClean","WonderMug",
                "MagicMug","SuperMug","CleanMate","HomeCare","EasyMug","PrimeMug","KingMug","FreshMug","SafeMug","EliteMug",
                "SpotZero","Gala","ScotchBrite","Generic","Bright","Glow","LiteOn","Sunlite","PowerPlus","Rocket"
            };
            return mugBrands;
        }
        if(productName == "hanger"){
            String hangerBrands[] = {
                "Cello","Supreme","Princeware","Generic","Milton","Prestige","Pigeon","Bathla","TruClean","QuickClean",
                "WonderHanger","MagicHanger","SuperHanger","CleanMate","HomeCare","EasyHanger","PrimeHanger","KingHanger","FreshHanger","SafeHanger",
                "EliteHanger","SpotZero","Gala","ScotchBrite","Bright","Glow","LiteOn","Sunlite","PowerPlus","Rocket"
            };
            return hangerBrands;
        }
        if(productName == "clothClip"){
            String clothClipBrands[] = {
                "Supreme","Cello","Generic","Princeware","Milton","Prestige","Pigeon","Bathla","TruClean","QuickClean",
                "WonderClip","MagicClip","SuperClip","CleanMate","HomeCare","EasyClip","PrimeClip","KingClip","FreshClip","SafeClip",
                "EliteClip","SpotZero","Gala","ScotchBrite","Bright","Glow","LiteOn","Sunlite","PowerPlus","Rocket"
            };
            return clothClipBrands;
        }
        if(productName == "shoePolish"){
            String shoePolishBrands[] = {
                "CherryBlossom","Kiwi","Cherry","CherryBlack","Columbus","Bata","Brasso","ShoeShine","ShoeCare","SuperPolish",
                "PrimePolish","KingPolish","FreshPolish","SafePolish","ElitePolish","SupremePolish","Princeware","Generic","Bright","Glow",
                "LiteOn","Sunlite","PowerPlus","Rocket","Milton","Prestige","Pigeon","Bathla","TruClean","QuickClean"
            };
            return shoePolishBrands;
        }
        if(productName == "shoeBrush"){
            String shoeBrushBrands[] = {
                "Kiwi","Cherry","Generic","CherryBlack","Columbus","Bata","Brasso","ShoeShine","ShoeCare","SuperBrush",
                "PrimeBrush","KingBrush","FreshBrush","SafeBrush","EliteBrush","SupremeBrush","Princeware","Bright","Glow","LiteOn",
                "Sunlite","PowerPlus","Rocket","Milton","Prestige","Pigeon","Bathla","TruClean","QuickClean","WonderBrush"
            };
            return shoeBrushBrands;
        }
        if(productName == "facePowder"){
            String facePowderBrands[] = {
                "Ponds","Spinz","Nycil","Dermicool","Lakme","FairLovely","CavinKare","Himalaya","Biotique","VLCC",
                "Lotus","Nivea","Johnson","Sebamed","Mamaearth","ForestEssentials","Soulflower","Dove","Fiama","Lux",
                "Liril","Cinthol","Santoor","Hamam","Medimix","MysoreSandal","ParkAvenue","Yardley","Rexona","Palmolive"
            };
            return facePowderBrands;
        }
        if(productName == "talcumPowder"){
            String talcumPowderBrands[] = {
                "Nycil","Dermicool","Ponds","Spinz","Lakme","FairLovely","CavinKare","Himalaya","Biotique","VLCC",
                "Lotus","Nivea","Johnson","Sebamed","Mamaearth","ForestEssentials","Soulflower","Dove","Fiama","Lux",
                "Liril","Cinthol","Santoor","Hamam","Medimix","MysoreSandal","ParkAvenue","Yardley","Rexona","Palmolive"
            };
            return talcumPowderBrands;
        }
        if(productName == "deodorant"){
            String deodorantBrands[] = {
                "Axe","Fogg","WildStone","Engage","Denver","ParkAvenue","Yardley","Nivea","Rexona","SetWet",
                "OldSpice","Brut","Adidas","Nike","Gillette","Cinthol","Spinz","Romano","KS","Playboy",
                "Jaguar","JaguarClassic","JaguarGold","JaguarBlack","JaguarRed","JaguarBlue","JaguarGreen","JaguarSilver","JaguarWhite","JaguarPink"
            };
            return deodorantBrands;
        }
        if(productName == "perfume"){
            String perfumeBrands[] = {
                "Denver","Yardley","BellaVita","TitanSkinn","Fogg","WildStone","Engage","ParkAvenue","Jaguar","JaguarClassic",
                "JaguarGold","JaguarBlack","JaguarRed","JaguarBlue","JaguarGreen","JaguarSilver","JaguarWhite","JaguarPink","Nivea","Rexona",
                "SetWet","OldSpice","Brut","Adidas","Nike","Gillette","Cinthol","Spinz","Romano","KS"
            };
            return perfumeBrands;
        }
        if(productName == "razor"){
            String razorBrands[] = {
                "Gillette","Supermax","Laser","LetsShave","Dorco","BIC","Schick","Wilkinson","Feather","Personna",
                "Parker","Astra","Lord","Kai","Rockwell","Merkur","Maggard","VanDerHagen","Harrys","DollarShaveClub",
                "Jaguar","JaguarClassic","JaguarGold","JaguarBlack","JaguarRed","JaguarBlue","JaguarGreen","JaguarSilver","JaguarWhite","JaguarPink"
            };
            return razorBrands;
        }
        if(productName == "shavingCream"){
            String shavingCreamBrands[] = {
                "OldSpice","Godrej","Gillette","ParkAvenue","Nivea","Dettol","Palmolive","ViJohn","WildStone","Engage",
                "Denver","Yardley","BellaVita","TitanSkinn","Fogg","Jaguar","JaguarClassic","JaguarGold","JaguarBlack","JaguarRed",
                "JaguarBlue","JaguarGreen","JaguarSilver","JaguarWhite","JaguarPink","KS","Romano","Spinz","Cinthol","Nike"
            };
            return shavingCreamBrands;
        }
        if(productName == "afterShave"){
            String afterShaveBrands[] = {
                "OldSpice","ParkAvenue","Gillette","Denver","Yardley","BellaVita","TitanSkinn","Fogg","WildStone","Engage",
                "Jaguar","JaguarClassic","JaguarGold","JaguarBlack","JaguarRed","JaguarBlue","JaguarGreen","JaguarSilver","JaguarWhite","JaguarPink",
                "KS","Romano","Spinz","Cinthol","Nike","Nivea","Dettol","Palmolive","ViJohn","Godrej"
            };
            return afterShaveBrands;
        }
        if(productName == "babyDiapers"){
            String babyDiapersBrands[] = {
                "Pampers","Huggies","MamyPoko","Snuggy","Supples","LittleAngel","MeeMee","Chicco","Himalaya","MotherCare",
                "TinyCare","Teddyy","BeyBee","Babylove","Babyhug","BamboNature","Libero","Drypers","Merries","Pigeon",
                "Johnson","Sebamed","Mamaearth","Nivea","Dove","Fiama","Lux","Liril","Cinthol","Santoor"
            };
            return babyDiapersBrands;
        }
        if(productName == "babyWipes"){
            String babyWipesBrands[] = {
                "HimalayaBaby","PampersW","MeeMee","MotherSparsh","Chicco","Supples","LittleAngel","MamyPoko","Huggies","Snuggy",
                "TinyCare","Teddyy","BeyBee","Babylove","Babyhug","BamboNature","Libero","Drypers","Merries","Pigeon",
                "Johnson","Sebamed","Mamaearth","Nivea","Dove","Fiama","Lux","Liril","Cinthol","Santoor"
            };
            return babyWipesBrands;
        }
        if(productName == "babyPowder"){
            String babyPowderBrands[] = {
                "Johnson","HimalayaBaby","MeeMee","Sebamed","Chicco","Supples","LittleAngel","MamyPoko","Huggies","Snuggy",
                "TinyCare","Teddyy","BeyBee","Babylove","Babyhug","BamboNature","Libero","Drypers","Merries","Pigeon",
                "MotherCare","Fiama","Lux","Liril","Cinthol","Santoor","Hamam","Medimix","MysoreSandal","VLCC"
            };
            return babyPowderBrands;
        }
        if(productName == "babySoap"){
            String babySoapBrands[] = {
                "Johnson","HimalayaBaby","Sebamed","MeeMee","Chicco","Supples","LittleAngel","MamyPoko","Huggies","Snuggy",
                "TinyCare","Teddyy","BeyBee","Babylove","Babyhug","BamboNature","Libero","Drypers","Merries","Pigeon",
                "MotherCare","Fiama","Lux","Liril","Cinthol","Santoor","Hamam","Medimix","MysoreSandal","VLCC"
            };
            return babySoapBrands;
        }
        if(productName == "bread"){
            String breadBrands[] = {"Britannia","HarvestGold","Modern","EnglishOven"};
            return breadBrands;
        }
        if(productName == "brownBread"){
            String brownBreadBrands[] = {"HarvestGold","Modern","Britannia","Fresho"};
            return brownBreadBrands;
        }
        if(productName == "burgerBun"){
            String burgerBunBrands[] = {"Britannia","HarvestGold","EnglishOven","Modern"};
            return burgerBunBrands;
        }
        if(productName == "pizzaBase"){
            String pizzaBaseBrands[] = {"Britannia","DelMonte","FunFoods","Weikfield"};
            return pizzaBaseBrands;
        }
        if(productName == "butterCookies"){
            String butterCookiesBrands[] = {"GoodDayCreamy","Danisa","Unibic","MomMagic"};
            return butterCookiesBrands;
        }
        if(productName == "dryFruits"){
            String dryFruitsBrands[] = {"Nutraj","Happilo","Tulsi","Vedaka"};
            return dryFruitsBrands;
        }
        if(productName == "almonds"){
            String almondsBrands[] = {"CaliforniaAlmonds","Tulsi","Nutraj","Vedaka"};
            return almondsBrands;
        }
        if(productName == "cashews"){
            String cashewsBrands[] = {"GoanCashews","Tulsi","Nutraj","Vedaka"};
            return cashewsBrands;
        }
        if(productName == "raisins"){
            String raisinsBrands[] = {"Vedaka","Nutraj","Tulsi","Happilo"};
            return raisinsBrands;
        }
        if(productName == "dates"){
            String datesBrands[] = {"LionDates","Tulsi","Nutraj","Vedaka"};
            return datesBrands;
        }
        if(productName == "peanuts"){
            String peanutsBrands[] = {"Haldirams","Bikaji","Vedaka","Tulsi"};
            return peanutsBrands;
        }
        if(productName == "chanaDal"){
            String chanaDalBrands[] = {"TataSampann","24Mantra","BBRoyal","Vedaka"};
            return chanaDalBrands;
        }
        if(productName == "toorDal"){
            String toorDalBrands[] = {"TataSampann","24Mantra","BBRoyal","Vedaka"};
            return toorDalBrands;
        }
        if(productName == "moongDal"){
            String moongDalBrands[] = {"TataSampann","24Mantra","BBRoyal","Vedaka"};
            return moongDalBrands;
        }
        if(productName == "uradDal"){
            String uradDalBrands[] = {"TataSampann","24Mantra","BBRoyal","Vedaka"};
            return uradDalBrands;
        }
        if(productName == "masoorDal"){
            String masoorDalBrands[] = {"TataSampann","24Mantra","BBRoyal","Vedaka"};
            return masoorDalBrands;
        }
        if(productName == "garamMasala"){
            String garamMasalaBrands[] = {"MDH","Everest","Catch","Eastern"};
            return garamMasalaBrands;
        }
        if(productName == "turmeric"){
            String turmericBrands[] = {"Everest","MDH","Catch","Eastern"};
            return turmericBrands;
        }
        if(productName == "chilliPowder"){
            String chilliPowderBrands[] = {"Everest","MDH","Catch","Eastern"};
            return chilliPowderBrands;
        }
        if(productName == "corianderPowder"){
            String corianderPowderBrands[] = {"Everest","MDH","Catch","Eastern"};
            return corianderPowderBrands;
        }
        if(productName == "jeera"){
            String jeeraBrands[] = {"TataSampann","Catch","Everest","24Mantra"};
            return jeeraBrands;
        }
        if(productName == "mustardSeeds"){
            String mustardSeedsBrands[] = {"TataSampann","Catch","Everest","24Mantra"};
            return mustardSeedsBrands;
        }
        if(productName == "hing"){
            String hingBrands[] = {"LG","Ramdev","Catch","Everest"};
            return hingBrands;
        }
        if(productName == "pickle"){
            String pickleBrands[] = {"Priya","Aachi","MotherRecipe","Patanjali"};
            return pickleBrands;
        }
        if(productName == "papad"){
            String papadBrands[] = {"Lijjat","Aachi","24Mantra","Patanjali"};
            return papadBrands;
        }
        if(productName == "jam"){
            String jamBrands[] = {"Kissan", "Mapro", "Bhuira", "St.Dalfour"};
            return jamBrands;
        }
        if(productName == "peanutButter"){
            String peanutButterBrands[] = {"Pintola", "Alpino", "Dr.Oetker", "Skippy"};
            return peanutButterBrands;
        }
        if(productName == "mayonnaise"){
            String mayonnaiseBrands[] = {"FunFoods", "Veeba", "DelMonte", "Cremica"};
            return mayonnaiseBrands;
        }
        if(productName == "honey"){
            String honeyBrands[] = {"Dabur", "Patanjali", "Apis", "24Mantra"};
            return honeyBrands;
        }
        if(productName == "ketchup"){
            String ketchupBrands[] = {"Kissan", "Maggi", "Heinz", "DelMonte"};
            return ketchupBrands;
        }
        if(productName == "corn"){
            String cornBrands[] = {"DelMonte", "GoldenCorn", "OrganicTattva", "UrbanPlatter"};
            return cornBrands;
        }
        if(productName == "oliveOil"){
            String oliveOilBrands[] = {"Figaro", "Borges", "Disano", "DelMonte"};
            return oliveOilBrands;
        }
        if(productName == "sunflowerOil"){
            String sunflowerOilBrands[] = {"Fortune", "Saffola", "Sundrop", "Dhara"};
            return sunflowerOilBrands;
        }
        if(productName == "mustardOil"){
            String mustardOilBrands[] = {"Fortune", "Engine", "Patanjali", "Dhara"};
            return mustardOilBrands;
        }
        if(productName == "soyaChunks"){
            String soyaChunksBrands[] = {"Nutrela", "Fortune", "Ruchi", "BBRoyal"};
            return soyaChunksBrands;
        }
                if(productName == "muesli"){
            String muesliBrands[] = {"Kelloggs", "Bagrrys", "YogaBar", "TrueElements"};
            return muesliBrands;
        }
        if(productName == "granolaBar"){
            String granolaBarBrands[] = {"YogaBar", "NatureValley", "Kelloggs", "RiteBite"};
            return granolaBarBrands;
        }
        if(productName == "peanutChikki"){
            String peanutChikkiBrands[] = {"Haldirams", "Bikaji", "Garden", "Nutraj"};
            return peanutChikkiBrands;
        }
        if(productName == "energyBar"){
            String energyBarBrands[] = {"RiteBite", "YogaBar", "MaxProtein", "EatAnyTime"};
            return energyBarBrands;
        }
        if(productName == "instantSoup"){
            String instantSoupBrands[] = {"Knorr", "Maggi", "Chings", "Sunfeast"};
            return instantSoupBrands;
        }
        if(productName == "readyToEat"){
            String readyToEatBrands[] = {"MTR", "Haldirams", "ITC", "Gits"};
            return readyToEatBrands;
        }
        if(productName == "frozenPeas"){
            String frozenPeasBrands[] = {"Safal", "MotherDairy", "Vadilal", "GodrejYummiez"};
            return frozenPeasBrands;
        }
        if(productName == "frozenParatha"){
            String frozenParathaBrands[] = {"ITC", "Haldirams", "GodrejYummiez", "MTR"};
            return frozenParathaBrands;
        }
        if(productName == "iceCream"){
            String iceCreamBrands[] = {"Amul", "KwalityWalls", "Vadilal", "Arun"};
            return iceCreamBrands;
        }
        if(productName == "frozenFrenchFries"){
            String frozenFrenchFriesBrands[] = {"McCain", "ITC", "GodrejYummiez", "Safal"};
            return frozenFrenchFriesBrands;
        }
        if(productName == "paneerButterMasalaMix"){
            String pbmMixBrands[] = {"MTR", "Gits", "ITC", "Haldirams"};
            return pbmMixBrands;
        }
        if(productName == "cakeMix"){
            String cakeMixBrands[] = {"BettyCrocker", "Pillsbury", "Weikfield", "MTR"};
            return cakeMixBrands;
        }
        if(productName == "bakingPowder"){
            String bakingPowderBrands[] = {"Weikfield", "Rex", "BlueBird", "UrbanPlatter"};
            return bakingPowderBrands;
        }
        if(productName == "bakingSoda"){
            String bakingSodaBrands[] = {"Weikfield", "UrbanPlatter", "Rex", "BlueBird"};
            return bakingSodaBrands;
        }
        if(productName == "yeast"){
            String yeastBrands[] = {"UrbanPlatter", "Weikfield", "BlueBird", "Angel"};
            return yeastBrands;
        }
        if(productName == "vanillaEssence"){
            String vanillaEssenceBrands[] = {"Weikfield", "BlueBird", "UrbanPlatter", "Bakersville"};
            return vanillaEssenceBrands;
        }
        if(productName == "sprouts"){
            String sproutsBrands[] = {"BBRoyal", "24Mantra", "OrganicIndia", "Vedaka"};
            return sproutsBrands;
        }
        if(productName == "tofu"){
            String tofuBrands[] = {"NutraRich", "UrbanPlatter", "Soyfit", "TofuKing"};
            return tofuBrands;
        }
        if(productName == "soyMilk"){
            String soyMilkBrands[] = {"Sofit", "Staeta", "Soyfresh", "UrbanPlatter"};
            return soyMilkBrands;
        }
        if(productName == "almondMilk"){
            String almondMilkBrands[] = {"AlmondBreeze", "RawPressery", "SoGood", "UrbanPlatter"};
            return almondMilkBrands;
        }
        if(productName == "coconutMilk"){
            String coconutMilkBrands[] = {"Kara", "UrbanPlatter", "Ayam", "ThaiHeritage"};
            return coconutMilkBrands;
        }
        if(productName == "riceBranOil"){
            String riceBranOilBrands[] = {"Fortune", "Ricela", "Saffola", "Emami"};
            return riceBranOilBrands;
        }
        if(productName == "canolaOil"){
            String canolaOilBrands[] = {"Hudson", "Jivo", "Disano", "Emami"};
            return canolaOilBrands;
        }
        if(productName == "gourmetSalt"){
            String gourmetSaltBrands[] = {"UrbanPlatter", "TataRockSalt", "Keya", "Catch"};
            return gourmetSaltBrands;
        }
        if(productName == "blackPepper"){
            String blackPepperBrands[] = {"Catch", "Everest", "24Mantra", "UrbanPlatter"};
            return blackPepperBrands;
        }
        if(productName == "oregano"){
            String oreganoBrands[] = {"Keya", "UrbanPlatter", "Catch", "FunFoods"};
            return oreganoBrands;
        }
        if(productName == "basil"){
            String basilBrands[] = {"Keya", "UrbanPlatter", "Catch", "FunFoods"};
            return basilBrands;
        }
        if(productName == "mixedHerbs"){
            String mixedHerbsBrands[] = {"Keya", "UrbanPlatter", "Catch", "FunFoods"};
            return mixedHerbsBrands;
        }
                if(productName == "sambarPowder"){
            String sambarPowderBrands[] = {"MTR", "Aachi", "Eastern", "Sakthi"};
            return sambarPowderBrands;
        }
        if(productName == "rasamPowder"){
            String rasamPowderBrands[] = {"MTR", "Aachi", "Eastern", "Sakthi"};
            return rasamPowderBrands;
        }
        if(productName == "idliRava"){
            String idliRavaBrands[] = {"BBRoyal", "24Mantra", "DoubleHorse", "Annapurna"};
            return idliRavaBrands;
        }
        if(productName == "idliDosaBatter"){
            String idliDosaBatterBrands[] = {"iD", "Fresho", "Nilgiris", "Annapurna"};
            return idliDosaBatterBrands;
        }
        if(productName == "paneerTikkaMasala"){
            String paneerTikkaMasalaBrands[] = {"MDH", "Everest", "Catch", "Eastern"};
            return paneerTikkaMasalaBrands;
        }
        if(productName == "pavBhajiMasala"){
            String pavBhajiMasalaBrands[] = {"Everest", "MDH", "Catch", "Badshah"};
            return pavBhajiMasalaBrands;
        }
        if(productName == "choleMasala"){
            String choleMasalaBrands[] = {"MDH", "Everest", "Catch", "Badshah"};
            return choleMasalaBrands;
        }
        if(productName == "rajmaMasala"){
            String rajmaMasalaBrands[] = {"MDH", "Everest", "Catch", "Badshah"};
            return rajmaMasalaBrands;
        }
        if(productName == "kitchenKingMasala"){
            String kitchenKingMasalaBrands[] = {"Everest", "MDH", "Catch", "Badshah"};
            return kitchenKingMasalaBrands;
        }
        if(productName == "biryaniMasala"){
            String biryaniMasalaBrands[] = {"Shan", "Everest", "MDH", "Badshah"};
            return biryaniMasalaBrands;
        }
        if(productName == "fishMasala"){
            String fishMasalaBrands[] = {"Eastern", "Everest", "MDH", "Catch"};
            return fishMasalaBrands;
        }
        if(productName == "chickenMasala"){
            String chickenMasalaBrands[] = {"Everest", "MDH", "Eastern", "Catch"};
            return chickenMasalaBrands;
        }
        if(productName == "muttonMasala"){
            String muttonMasalaBrands[] = {"Everest", "MDH", "Eastern", "Catch"};
            return muttonMasalaBrands;
        }
        if(productName == "eggMasala"){
            String eggMasalaBrands[] = {"Eastern", "Everest", "MDH", "Catch"};
            return eggMasalaBrands;
        }
        if(productName == "garlicPaste"){
            String garlicPasteBrands[] = {"Smith&Jones", "Mother'sRecipe", "Tops", "Everest"};
            return garlicPasteBrands;
        }
        if(productName == "gingerPaste"){
            String gingerPasteBrands[] = {"Smith&Jones", "Mother'sRecipe", "Tops", "Everest"};
            return gingerPasteBrands;
        }
        if(productName == "gingerGarlicPaste"){
            String gingerGarlicPasteBrands[] = {"Smith&Jones", "Mother'sRecipe", "Tops", "Everest"};
            return gingerGarlicPasteBrands;
        }
        if(productName == "tamarindPaste"){
            String tamarindPasteBrands[] = {"Mother'sRecipe", "Tops", "Everest", "Eastern"};
            return tamarindPasteBrands;
        }
        if(productName == "coconutDesiccated"){
            String coconutDesiccatedBrands[] = {"UrbanPlatter", "24Mantra", "BBRoyal", "DoubleHorse"};
            return coconutDesiccatedBrands;
        }
        if(productName == "coconutOilCooking"){
            String coconutOilCookingBrands[] = {"Parachute", "MaxCare", "KLF", "VVD"};
            return coconutOilCookingBrands;
        }
        if(productName == "sesameOil"){
            String sesameOilBrands[] = {"Idhayam", "Anjali", "24Mantra", "BBRoyal"};
            return sesameOilBrands;
        }
        if(productName == "groundnutOil"){
            String groundnutOilBrands[] = {"Fortune", "24Mantra", "BBRoyal", "Dhara"};
            return groundnutOilBrands;
        }
        if(productName == "safflowerOil"){
            String safflowerOilBrands[] = {"Fortune", "Sundrop", "24Mantra", "BBRoyal"};
            return safflowerOilBrands;
        }
        if(productName == "cornOil"){
            String cornOilBrands[] = {"Saffola", "Disano", "Mazola", "GrofersMother'sChoice"};
            return cornOilBrands;
        }
        if(productName == "walnutOil"){
            String walnutOilBrands[] = {"UrbanPlatter", "Natureland", "24Mantra", "BBRoyal"};
            return walnutOilBrands;
        }
        if(productName == "flaxseedOil"){
            String flaxseedOilBrands[] = {"SattvicFoods", "UrbanPlatter", "Natureland", "BBRoyal"};
            return flaxseedOilBrands;
        }
        if(productName == "pumpkinSeeds"){
            String pumpkinSeedsBrands[] = {"TrueElements", "RawNature", "UrbanPlatter", "Happilo"};
            return pumpkinSeedsBrands;
        }
        if(productName == "chiaSeeds"){
            String chiaSeedsBrands[] = {"TrueElements", "RawNature", "UrbanPlatter", "Happilo"};
            return chiaSeedsBrands;
        }
        if(productName == "sunflowerSeeds"){
            String sunflowerSeedsBrands[] = {"TrueElements", "RawNature", "UrbanPlatter", "Happilo"};
            return sunflowerSeedsBrands;
        }
        if(productName == "melonSeeds"){
            String melonSeedsBrands[] = {"TrueElements", "RawNature", "UrbanPlatter", "Happilo"};
            return melonSeedsBrands;
        }
        if(productName == "quinoa"){
            String quinoaBrands[] = {"OrganicIndia", "24Mantra", "BBRoyal", "UrbanPlatter"};
            return quinoaBrands;
        }
        if(productName == "millets"){
            String milletsBrands[] = {"24Mantra", "BBRoyal", "OrganicIndia", "SlurrpFarm"};
            return milletsBrands;
        }
        if(productName == "foxtailMillet"){
            String foxtailMilletBrands[] = {"24Mantra", "BBRoyal", "OrganicIndia", "SlurrpFarm"};
            return foxtailMilletBrands;
        }
        if(productName == "barnyardMillet"){
            String barnyardMilletBrands[] = {"24Mantra", "BBRoyal", "OrganicIndia", "SlurrpFarm"};
            return barnyardMilletBrands;
        }
        if(productName == "littleMillet"){
            String littleMilletBrands[] = {"24Mantra", "BBRoyal", "OrganicIndia", "SlurrpFarm"};
            return littleMilletBrands;
        }
        if(productName == "kodoMillet"){
            String kodoMilletBrands[] = {"24Mantra", "BBRoyal", "OrganicIndia", "SlurrpFarm"};
            return kodoMilletBrands;
        }
        if(productName == "bajraFlour"){
            String bajraFlourBrands[] = {"24Mantra", "BBRoyal", "OrganicIndia", "Aashirvaad"};
            return bajraFlourBrands;
        }
        if(productName == "jowarFlour"){
            String jowarFlourBrands[] = {"24Mantra", "BBRoyal", "OrganicIndia", "Aashirvaad"};
            return jowarFlourBrands;
        }
        if(productName == "ragiFlour"){
            String ragiFlourBrands[] = {"24Mantra", "BBRoyal", "OrganicIndia", "Aashirvaad"};
            return ragiFlourBrands;
        }
        if(productName == "cornFlour"){
            String cornFlourBrands[] = {"Weikfield", "Brown&Polson", "UrbanPlatter", "BlueBird"};
            return cornFlourBrands;
        }
        if(productName == "custardPowder"){
            String custardPowderBrands[] = {"Brown&Polson", "Weikfield", "BlueBird", "UrbanPlatter"};
            return custardPowderBrands;
        }
        if(productName == "gelatin"){
            String gelatinBrands[] = {"UrbanPlatter", "BlueBird", "Weikfield", "Bakersville"};
            return gelatinBrands;
        }
        if(productName == "agarAgar"){
            String agarAgarBrands[] = {"UrbanPlatter", "BlueBird", "Weikfield", "Bakersville"};
            return agarAgarBrands;
        }
        if(productName == "cornStarch"){
            String cornStarchBrands[] = {"Weikfield", "UrbanPlatter", "BlueBird", "Brown&Polson"};
            return cornStarchBrands;
        }
        if(productName == "icingSugar"){
            String icingSugarBrands[] = {"Weikfield", "BlueBird", "UrbanPlatter", "Bakersville"};
            return icingSugarBrands;
        }
        if(productName == "brownSugar"){
            String brownSugarBrands[] = {"Dhampure", "24Mantra", "BBRoyal", "UrbanPlatter"};
            return brownSugarBrands;
        }
        if(productName == "jaggeryPowder"){
            String jaggeryPowderBrands[] = {"24Mantra", "BBRoyal", "OrganicIndia", "Dhampure"};
            return jaggeryPowderBrands;
        }
        if(productName == "rockSalt"){
            String rockSaltBrands[] = {"TataRockSalt", "UrbanPlatter", "24Mantra", "Catch"};
            return rockSaltBrands;
        }
        if(productName == "tableSalt"){
            String tableSaltBrands[] = {"TataSalt", "AashirvaadSalt", "Catch", "CaptainCook"};
            return tableSaltBrands;
        }
        if(productName == "soupSticks"){
            String soupSticksBrands[] = {"Fresho", "Modern", "EnglishOven", "Britannia"};
            return soupSticksBrands;
        }
        if(productName == "breadCrumbs"){
            String breadCrumbsBrands[] = {"Weikfield", "UrbanPlatter", "Fresho", "Modern"};
            return breadCrumbsBrands;
        }
        if(productName == "pastaSauce"){
            String pastaSauceBrands[] = {"DelMonte", "Veeba", "FunFoods", "AmericanGarden"};
            return pastaSauceBrands;
        }
        if(productName == "pizzaSauce"){
            String pizzaSauceBrands[] = {"FunFoods", "Veeba", "DelMonte", "AmericanGarden"};
            return pizzaSauceBrands;
        }
        if(productName == "mustardSauce"){
            String mustardSauceBrands[] = {"French's", "Heinz", "AmericanGarden", "Veeba"};
            return mustardSauceBrands;
        }
        if(productName == "soySauce"){
            String soySauceBrands[] = {"Chings", "Kikkoman", "LeeKumKee", "Weikfield"};
            return soySauceBrands;
        }
        if(productName == "vinegar"){
            String vinegarBrands[] = {"AmericanGarden", "Heinz", "Chings", "Weikfield"};
            return vinegarBrands;
        }
        if(productName == "schezwanSauce"){
            String schezwanSauceBrands[] = {"Chings", "Smith&Jones", "Veeba", "FunFoods"};
            return schezwanSauceBrands;
        }
        if(productName == "greenChilliSauce"){
            String greenChilliSauceBrands[] = {"Chings", "Smith&Jones", "Veeba", "FunFoods"};
            return greenChilliSauceBrands;
        }
        if(productName == "redChilliSauce"){
            String redChilliSauceBrands[] = {"Chings", "Smith&Jones", "Veeba", "FunFoods"};
            return redChilliSauceBrands;
        }
        if(productName == "tomatoPuree"){
            String tomatoPureeBrands[] = {"Kissan", "DelMonte", "Heinz", "AmericanGarden"};
            return tomatoPureeBrands;
        }
        if(productName == "cannedBeans"){
            String cannedBeansBrands[] = {"DelMonte", "AmericanGarden", "Heinz", "UrbanPlatter"};
            return cannedBeansBrands;
        }
        if(productName == "cannedCorn"){
            String cannedCornBrands[] = {"DelMonte", "GoldenCorn", "AmericanGarden", "UrbanPlatter"};
            return cannedCornBrands;
        }
        if(productName == "cannedPineapple"){
            String cannedPineappleBrands[] = {"DelMonte", "AmericanGarden", "UrbanPlatter", "GoldenHarvest"};
            return cannedPineappleBrands;
        }
        if(productName == "cannedPeaches"){
            String cannedPeachesBrands[] = {"DelMonte", "AmericanGarden", "UrbanPlatter", "GoldenHarvest"};
            return cannedPeachesBrands;
        }
        if(productName == "cannedMushrooms"){
            String cannedMushroomsBrands[] = {"DelMonte", "AmericanGarden", "UrbanPlatter", "GoldenHarvest"};
            return cannedMushroomsBrands;
        }
        return null;
    }
}