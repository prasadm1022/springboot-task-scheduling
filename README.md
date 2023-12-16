## Explanation :

### docker-compose-backend.yml

#### **backend-server-scheduler :**

* This will be started with the active spring profile of **"scheduler"** (this "scheduler" is a custom profile name) and
  responsible for executing the scheduled tasks automatically.
* example method :

> > org.upwork.prototype.service.SchedulerService.doSomething()

#### **backend-server-normal :**

* This server will be started with the default spring profile.
* This can be scale to any number of replicas when needed. (currently only two nodes will be started)

#### **load-balancer :**

* If an endpoint of above services has been called by a user, then that will be redirected to an available service.

> > curl --location --request POST 'http://localhost:7000/scheduler-service/v1/scheduler'
