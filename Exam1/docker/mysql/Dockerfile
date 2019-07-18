FROM registry.saas.hand-china.com/tools/mysql:5.6
VOLUME /var/lib/mysql
WORKDIR /
COPY sakila* /
RUN mysqld && mysql -uroot -padmin123 -e'create database sakila' && mysql -uroot -padmin123 sakila < /sakila-schema.sql && mysql -uroot -padmin123 sakila < /sakila-data.sql