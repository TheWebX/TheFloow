db.createCollection("com.thefloow.examples.beans.CollectedWord");
db.getCollection("com.thefloow.examples.beans.CollectedWord").createIndex({"word": 1});
db.createCollection("com.thefloow.examples.beans.PopularWord");
db.getCollection("com.thefloow.examples.beans.PopularWord").createIndex({"word": 1});
db.createCollection("com.thefloow.examples.beans.Offset");
db.getCollection("com.thefloow.examples.beans.Offset").createIndex({"value": 1});