FROM node:20.10.0 as build
WORKDIR /app
COPY package.json .
RUN yarn
COPY . .
RUN yarn build

FROM nginx:1.25.3
COPY --from=build /app/build /usr/share/nginx/html/dist
COPY ./nginx.conf /etc/nginx/nginx.conf
EXPOSE 8080
CMD ["/usr/sbin/nginx"]
