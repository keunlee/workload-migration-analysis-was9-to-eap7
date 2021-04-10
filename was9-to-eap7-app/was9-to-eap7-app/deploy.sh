# create a new openshift application, by providing
# - an application container image to leverage (i.e. image-registry.openshift-image-registry.svc:5000/openshift/jboss-eap73-openshift)
# - the location of your deployment target (i.e. ~target )
# - the name of the application (i.e. --name=was9-to-eap7-app)
oc new-app image-registry.openshift-image-registry.svc:5000/openshift/jboss-eap73-openshift~target  --name=was9-to-eap7-app

# upload a war file as a binary asset and trigger a new build
oc start-build was9-to-eap7-app --from-file=target/was9-to-eap7.war

# expose the service as a route so that we can make it accessible
oc expose service/was9-to-eap7-app