```bash

# create a new application and make sure to provide the path of the target after specify the image with ~path-to-target
oc new-app image-registry.openshift-image-registry.svc:5000/openshift/jboss-eap73-openshift~target  --name=was9-to-eap7-app

# upload the war file as a binary asset and trigger a new build
oc start-build was9-to-eap7-app --from-file=target/was9-to-eap7.war

# expose the service as a route so that we can make it accessible
oc expose service/was9-to-eap7-app
```