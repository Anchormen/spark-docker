# Zeppelin with Spark on Docker 
This package enables creating a Standalone Zeppelin on docker that connects to the spark cluster that is running on docker using `spark-docker` setup.  

## How does it work?
`docker-compose.yml` has some configuration about Zeppelin. When running Zeppelin on docker 2 points have to be taken into account:
1. `network` section shows the docker network that zeppelin will connect to. If Zeppelin connects to the same docker network as `spark-docker` cluster, it can access spark master node by using container name of the master node. The network name of the spark-docker cluster is `${compose-project-name}_default` you can find this value in `.env` file inside `spark-docker` folder.
2. `volumes` section has 3 parts: 
** `notebook`: notebooks being worked on Zeppelin will be cached in this folder. After the container dies the notebooks are persisted.
** `logs`: Zeppelin logs in for each notebook is persisted in this folder.
** `data`: any local data that is needed to be accessed by zeppelin should be placed in this folder. 


## Running a Zeppelin using Docker-compose
1. Build the image ```docker-compose build```
2. Start up Zeppelin with ```docker-compose up -d```
3. Check to see if Zeppelin is added to the spark cluser by running `docker network inspect`.
4. Check Zeppelin on `localhost:8090`
5. Run something on spark and check spark ui (`localhost:8080`) to see if Zeppelin task is running on cluster  
4. To destroy the cluster ```docker-compose down```

## Running Zeppelin using Docker
1. Build the image ```docker build -t zeppelin-spark:local .```
2. Start up Zeppeling with ```docker run -p 8080:8080 zeppelin-spark:local```
3. Visit `localhost:8080` in your web browser.