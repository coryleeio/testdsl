minikube start --vm-driver=virtualbox --memory=10000 --cpus=6
kubectl apply -f rbac.yml
helm init --upgrade --service-account=tiller

helm install stable/kubernetes-dashboard --name kubernetes-dashboard -f dashboard.yml
helm install --name jenkins stable/jenkins -f jenkins.yml


# this deploys a nginx pod which monitors /ingress on the api to get its routes
# it then generates an nginx config and uses that to route requests.
minikube addons enable ingress






EXTRAS
helm upgrade jenkins stable/jenkins -f jenkins.yml
kubectl -n default port-forward svc/kubernetes-dashboard 8443:443
kubectl -n default port-forward svc/jenkins 8080:8080
minikube service jenkins --url