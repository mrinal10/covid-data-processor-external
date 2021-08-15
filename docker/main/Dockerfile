FROM r.tide.co/tide-java-11:latest

# When building the image, set these arguments.
#
# The build tag of the image. See bin/docker-build.sh
ARG build_tag=?
# The commit that was used to build the image. See bin/docker-build.sh
ARG build_commit=?

ENV BUILD_TAG=$build_tag
ENV BUILD_COMMIT=$build_commit

WORKDIR /app

ADD build/libs/*.jar /app

EXPOSE 8080
CMD ["/app/run.sh"]
