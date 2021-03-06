from django.core.files.storage import FileSystemStorage
from django.db import models
from django.conf import settings

def getLocalVideoStorage():
    return FileSystemStorage(location=settings.MEDIA_ROOT)

def getRemoteVideoStorage():
    return ""